package com.platzimarket.domain.repository;

import com.platzimarket.domain.Purchase;
import com.platzimarket.persistence.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(long clientId);
    Purchase save(Purchase purchase);
    List<Compra> getAllCompras();
}
