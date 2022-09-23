package com.platzimarket.web.controller;

import com.platzimarket.domain.Purchase;
import com.platzimarket.domain.service.PurchaseService;
import com.platzimarket.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Predicate;

@RestController
@RequestMapping("/purchases")
@Validated
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping
    public ResponseEntity<List<Purchase>> getAll(){
       // return purchaseService.getAll().isEmpty() || purchaseService.getAll() == null ?
       //         new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("id")long clientId){
        return purchaseService.getByClient(clientId)
                .filter(Predicate.not(List::isEmpty))
                .map(purchases -> new ResponseEntity<>(purchases, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase), HttpStatus.CREATED);
    }

    @GetMapping("/compras")
    public ResponseEntity<List<Compra>> getAllCompras(){
        return new ResponseEntity<>(purchaseService.getAllCompras(), HttpStatus.OK);
    }
}
