package com.enoca.store.Service;

import com.enoca.store.Entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void add(Product product);
    void update(Product product);
    void delete(Product product);
}
