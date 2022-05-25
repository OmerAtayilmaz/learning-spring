package com.enoca.store.Controller;

import com.enoca.store.DataAccess.HibernateProductDal;
import com.enoca.store.DataAccess.IProductDal;
import com.enoca.store.Entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
@RestController
public class storeApi {

    @GetMapping("/")
    public ResponseEntity<Product> getMapping(){
        Product product=new Product(1l,"Shoe",2l,25.63f,250);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/products")
    public ResponseEntity<ArrayList<Product>> getData(){
        ArrayList<Product> productList =new ArrayList<>();
        productList.add(new Product(1l,"Shoe",2l,25.63f,250));
        productList.add(new Product(2l,"Bag",5l,251.26f,25));
        productList.add(new Product(3l,"Macbook",15l,5216.99f,120));
        return ResponseEntity.ok(productList);

    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<Product>> getALl(){
        ArrayList<Product> productList =new ArrayList<>();
        productList.add(new Product(1l,"Shoe",2l,25.63f,250));
        productList.add(new Product(2l,"Bag",5l,251.26f,25));
        productList.add(new Product(3l,"Macbook",15l,5216.99f,120));
        return ResponseEntity.ok(productList);
    }
}
