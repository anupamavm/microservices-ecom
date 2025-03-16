package com.ecom.inventory.controller;


import com.ecom.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInstock(@RequestParam String skuCode , @RequestParam Integer quantity){
        return  inventoryService.isInStock(skuCode,quantity);
    }
}
