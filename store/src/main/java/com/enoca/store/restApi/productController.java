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
    @GetMapping("/{id}")
    public Product getOne(@PathVariable Long id) {
        return (productService.getById(id));
    }
    //GET ALL DATA
    @GetMapping("/all")
    public List<Product> getALl() {
        return (productService.getAll());
    }
    //CREATE PRODUCT
    @PostMapping("/add")
    public ResponseEntity<String> create(@RequestBody Product product) {
        Product temp=new Product(null,product.getProduct_name(), product.getCategory_id(), product.getPrice(),product.getQuantity());
        productService.add(temp);
        return ResponseEntity.ok("Success");
    }

    //UPDATE PRODUCT
    @PostMapping("/update")
    public ResponseEntity<String> update(@RequestBody Product product) {
        productService.update(product);
        return ResponseEntity.ok("Success");
    }

    //GET ALL DATA
    @PostMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody Product product) {
        productService.delete(product);
        return ResponseEntity.ok("Success");
    }






}
