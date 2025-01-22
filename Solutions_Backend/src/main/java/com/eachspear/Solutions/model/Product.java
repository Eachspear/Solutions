package com.eachspear.Solutions.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Table(name="product")
public class Product {
    @Column(name="name")
    String name;
    @Column(name="price")
    int price;
    @Id
    @Column(name="id")
    int id;

    public Product()
    {
    }
    public Product(String name,int price,int id) {
        this.name = name;
        this.price=price;
        this.id=id;
    }

}
