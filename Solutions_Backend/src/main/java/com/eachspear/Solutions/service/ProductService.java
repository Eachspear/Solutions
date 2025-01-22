package com.eachspear.Solutions.service;
import com.eachspear.Solutions.model.Product;
import com.eachspear.Solutions.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;
@Service
public class ProductService {
   @Autowired
    ProductRepo rep;
    //List<Product> list=new ArrayList<> (Arrays.asList(new Product("Laptop",50000,100),
      //      new Product("mobile",10000,150)));

    public List<Product> getList() {
        return rep.findAll();
    }

    public Product getOne(int proId)
    {
      return rep.findById(proId).orElse(new Product());
    }

    public void postProduct(Product pro)
    {
       rep.save(pro);
    }

    public void updatepro(Product product) {
       rep.save(product);

    }

    public void deletepro(int proId) {
      rep.deleteById(proId);
    }
}
