package com.example.prueba.repository.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
public class ProductIdDTO implements Serializable {

    @Column(name = "id", nullable = false)
    private int id;
}
