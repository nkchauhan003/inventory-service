package com.cb.controller;

import com.cb.model.Inventory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public Inventory getInventory(@RequestParam String productId) throws InterruptedException {
        // 500 ms delay to simulate latency
        TimeUnit.MILLISECONDS.sleep(500);
        return Inventory.builder()
                .productId(productId)
                .status("In Stock")
                .availableQuantity(50)
                .build();
    }
}
