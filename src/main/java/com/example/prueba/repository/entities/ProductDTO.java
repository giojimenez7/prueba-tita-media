package com.example.prueba.repository.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "products")
public class ProductDTO {

    @Id
    private ProductIdDTO id;

    @Column(name = "invetory", nullable = false)
    private int inventory;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "nameProduct", nullable = false)
    private int nameProduct;
}
