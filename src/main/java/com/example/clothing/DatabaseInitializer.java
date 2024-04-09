package com.example.clothing;

import com.example.clothing.model.Brand;
import com.example.clothing.model.Item;
import com.example.clothing.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {
    private final ItemRepository itemRepository;

    public DatabaseInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add some sample items to the database
        itemRepository.save(new Item("T-Shirt", Brand.BALENCIAGA, 2022, 1500));
        itemRepository.save(new Item("Jeans ", Brand.STONE_ISLAND, 2022, 2000));
        // Add more items as needed
    }
}
