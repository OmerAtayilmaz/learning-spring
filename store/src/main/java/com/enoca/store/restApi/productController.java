package com.enoca.store.restApi;

import com.enoca.store.Entity.*;
import com.enoca.store.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("api")
public class productController {

    private IProductService productService;

    @Autowired
    public productController(IProductService productService) {
        this.productService = productService;
    }
    //GET ALL DATA
    @GetMapping("/one")
    public Product getOne(Long id) {
        return (productService.getById(id));
    }
    //GET ALL DATA
    @GetMapping("/all")
    public List<Product> getALl() {
        return (productService.getAll());
    }
    //CREATE PRODUCT
    @PostMapping("/create")
    public ResponseEntity<String> create() {
        Product product=new Product(20l,"xxx",7l,25l,25);
        productService.add(product);
        return ResponseEntity.ok("Success");
    }

    //UPDATE PRODUCT
    @PostMapping("/update")
    public ResponseEntity<String> update() {
        Product product=new Product(20l,"xxx",7l,25l,25);

        productService.update(product);
        return ResponseEntity.ok("Success");
    }

    //GET ALL DATA
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete() {
        Product product=new Product(20l,"xxx",7l,25l,25);

        productService.delete(product);
        return ResponseEntity.ok("Success");
    }






}
