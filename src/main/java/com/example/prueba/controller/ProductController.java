package com.example.prueba.controller;

import com.example.prueba.repository.entities.ProductDTO;
import com.example.prueba.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/inventory/list/{quantity}")
    private ResponseEntity<List<ProductDTO>> getProductsByQuantity(@PathVariable int quantity) {
        return new ResponseEntity<>(this.productService.getProductsByQuantity(quantity), HttpStatus.OK);
    }

    @GetMapping("/inventory/list/{orderType}")
    private ResponseEntity<List<ProductDTO>> getProductsOrderByType(@PathVariable int orderType) {
        return new ResponseEntity<>(this.productService.getProductsOrderByType(orderType), HttpStatus.OK);
    }
}
