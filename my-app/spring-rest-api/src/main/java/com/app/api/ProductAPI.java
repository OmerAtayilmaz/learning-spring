package com.app.api;


import com.app.models.Product;
import com.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductAPI {
    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init(){
        Product product=new Product();
        product.setProduct("Denemeler");
        product.setId("A0OSD0ADO0A");
        product.setCategory("Book");
        product.setPrice(5.4d);
        productRepository.save(product);
    }

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product){
        return ResponseEntity.ok(productRepository.save(product));
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productRepository.findAll());
    }
}
