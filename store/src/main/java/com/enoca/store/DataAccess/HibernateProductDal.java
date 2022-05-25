package com.enoca.store.DataAccess;

import com.enoca.store.Entity.Product;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

//JPA - ORM
public class HibernateProductDal implements IProductDal{

    private EntityManager entityManager;

    @Autowired
    public HibernateProductDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional //springden import edilmelidir  -AOP ASPECT ORIENTED PROGRAMMING  araştır-
    public List<Product> getAll() {

        //org.hibernate.session adresinden gelmelidir!
       Session session= entityManager.unwrap(Session.class);
       List<Product> productList=session.createQuery("from Product",Product.class).getResultList();
        return  productList;
    }

    @Override
    public void add(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }
}
