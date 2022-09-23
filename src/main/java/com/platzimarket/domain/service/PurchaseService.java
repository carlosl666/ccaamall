package com.platzimarket.domain.service;

import com.platzimarket.domain.Product;
import com.platzimarket.domain.Purchase;
import com.platzimarket.domain.repository.PurchaseRepository;
import com.platzimarket.persistence.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepository purchaseRepository;

    public List<Purchase> getAll(){
        List<Purchase> purchases = purchaseRepository.getAll();
        for(Purchase x : purchases){
            System.out.println(x.getItems());
        }
        return purchaseRepository.getAll();
    }

    public Optional<List<Purchase>> getByClient(long clientId){
        return purchaseRepository.getByClient(clientId);
    }

    public Purchase save(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public List<Compra> getAllCompras(){
        return purchaseRepository.getAllCompras();
    }
}
