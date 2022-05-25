package com.enoca.store.DataAccess;

import com.enoca.store.Entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class HibernateProductDal implements IProductDal{
    private EntityManager entityManager;

    @Autowired
    public HibernateProductDal(EntityManager entityManager) {
        this.entityManager=entityManager;
    }

    @Override
    @Transactional//AOP - Aspect ORiented Programming
    public List<Product> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<Product> productList=session.createQuery("from Product",Product.class).getResultList();
        return  productList;
    }

    @Override
    @Transactional
    public void add(Product product) {
        Session session=entityManager.unwrap(Session.class);
        session.save(product);
    }


    @Override
    @Transactional
    public void update(Product product) {
        Session session=entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        Session session=entityManager.unwrap(Session.class);
        session.delete(product);
    }

    @Override
    public Product getById(Long id) {
        Session session=entityManager.unwrap(Session.class);
        Product product=session.get(Product.class,id);
        return product;
    }
}
