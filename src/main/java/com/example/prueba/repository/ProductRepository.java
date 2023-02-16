package com.example.prueba.repository;

import com.example.prueba.repository.entities.ProductIdDTO;
import com.example.prueba.repository.entities.ProductDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductDTO, ProductIdDTO> {

    @Query("SELECT * FROM product WHERE invetory < :invetory")
    List<ProductDTO> getProductsByQuantity(@Param("inventory") int inventory);

    @Query("SELECT * FROM product ORDER BY inventory :orderType")
    List<ProductDTO> getProductsOrderByType(@Param("inventory") int inventory);
}
