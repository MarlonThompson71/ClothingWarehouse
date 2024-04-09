package com.example.clothing.controller;

import com.example.clothing.model.Item;
import com.example.clothing.repository.ItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/addItem")
    public String showAddItemForm(Model model) {
        model.addAttribute("item", new Item());
        return "addItem";
    }

    @PostMapping("/addItem")
    public String addItem(@ModelAttribute("item") Item item) {
        itemRepository.save(item);
        return "redirect:/listItems";
    }
}
