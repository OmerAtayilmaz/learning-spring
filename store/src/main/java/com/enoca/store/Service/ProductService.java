package com.enoca.store.Service;

import com.enoca.store.DataAccess.IProductDal;
import com.enoca.store.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProductService implements IProductService{


    private IProductDal productDal;
    @Autowired
    public ProductService(IProductDal productDal) {
        this.productDal = productDal;
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        return this.productDal.getAll();
    }

    @Override
    @Transactional
    public void add(Product product) {

    }

    @Override
    @Transactional
    public void update(Product product) {

    }

    @Override
    @Transactional
    public void delete(Product product) {

    }
}
