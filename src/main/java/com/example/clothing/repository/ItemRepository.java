package com.example.clothing.repository;

import com.example.clothing.model.Brand;
import com.example.clothing.model.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Page<Item> findAll(Pageable pageable);

    @Query("SELECT i FROM Item i WHERE i.brand = ?1 AND i.yearOfCreation = 2022")
    Page<Item> findByBrandAndYear(Brand brand, Pageable pageable);
}
