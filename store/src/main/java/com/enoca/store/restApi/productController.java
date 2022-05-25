package com.enoca.store.restApi;

import com.enoca.store.Entity.*;
import com.enoca.store.Service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Product> getALl(){



        return (productService.getAll());
    }
}
