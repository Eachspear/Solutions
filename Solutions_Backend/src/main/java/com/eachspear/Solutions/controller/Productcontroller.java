package com.eachspear.Solutions.controller;

import com.eachspear.Solutions.model.Product;
import com.eachspear.Solutions.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.lang.String;
import java.util.List;

@Component
@RestController
public class Productcontroller {
    @Autowired
    ProductService pro;
    @GetMapping("/products")
    public List<Product> getproduct()
    {
        return pro.getList();
    }
    @GetMapping("/products/{proId}")
    public Product getpro(@PathVariable int proId)
    {
        return pro.getOne(proId);
    }
    @PostMapping("/products")
    public void postpro(@RequestBody Product product)
    {
        System.out.println(product);
        pro.postProduct(product);
    }
    @PutMapping("/products")
    public void updatepro(@RequestBody Product product)
    {
        pro.updatepro(product);
    }
    @DeleteMapping("products/{proId}")
    public void deletepro(@PathVariable int proId)
    {
        pro.deletepro(proId);

    }
}
