package com.enoca.store.DataAccess;

import com.enoca.store.Entity.Product;

import java.util.List;

public interface IProductDal {
    List<Product> getAll();
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product getById(Long id);
}
