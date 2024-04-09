package com.example.clothing.controller;



import com.example.clothing.model.Brand;
import com.example.clothing.model.Item;
import com.example.clothing.repository.ItemRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListItemsController {

    private final ItemRepository itemRepository;

    public ListItemsController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/listItems")

    public String listItems(Model model) {
        Page<Item> items = itemRepository.findAll(PageRequest.of(0, 10));
        model.addAttribute("items", items.getContent());
        return "listItems";
    }

    // Handle sorting by brand
    public String deleteAllItems() {

         itemRepository.deleteAll();
        return "redirect:/listItems"; // Redirect back to the list items page
    }
}

