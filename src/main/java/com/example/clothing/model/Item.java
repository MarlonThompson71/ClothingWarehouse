package com.example.clothing.model;

import jakarta.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder


@Entity
@Table(name = "items")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Brand brand;
    private int yearOfCreation;
    private int price;

    // Constructors
    public Item() {
    }

    public Item(String name, Brand brand, int yearOfCreation, int price) {
        this.name = name;
        this.brand = brand;
        this.yearOfCreation = yearOfCreation;
        this.price = price;
    }


}