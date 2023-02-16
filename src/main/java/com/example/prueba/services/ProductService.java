package com.example.prueba.services;

import com.example.prueba.repository.ProductRepository;
import com.example.prueba.repository.entities.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getProductsByQuantity(int quantity) {
        return productRepository.getProductsByQuantity(quantity);
    }

    public List<ProductDTO> getProductsOrderByType(int quantity) {
        return productRepository.getProductsOrderByType(quantity);
    }
}
