package com.platzimarket.domain.service;

import com.platzimarket.domain.Product;
import com.platzimarket.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(long productId){
        return productRepository.getProduct(productId);
    }

    public Optional<List<Product>> getByCategory(long categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean delete(long productId){
        return getProduct(productId).map(product -> {
           productRepository.delete(productId);
           return true;
        }).orElse(false);
    }

    public boolean deleteEmpty(long productId){
        try {
            productRepository.delete(productId);
            return true;
        }catch (EmptyResultDataAccessException e){
            return false;
        }
    }

    public boolean deleteIsPresent(long productId){
        if(getProduct(productId).isPresent()){
            productRepository.delete(productId);
            return true;
        }else{
            return false;
        }
    }
}
