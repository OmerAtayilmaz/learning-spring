package com.enoca.store.Business;

import com.enoca.store.DataAccess.IProductDal;
import com.enoca.store.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductManager implements IProductService{
    //BUsiness data accessten veri alır

    private IProductDal productDal;

    @Autowired
    public ProductManager(IProductDal productDal){
        this.productDal=productDal;
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
    public void delete(Product product) {

    }
}
