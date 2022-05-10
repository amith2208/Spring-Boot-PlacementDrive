package com.example.Placement.controller;

import com.example.Placement.model.Purchase;
import com.example.Placement.service.PurchaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/Purchase")
@RestController
public class PurchaseController {
    private final PurchaseService pr;

    public PurchaseController(PurchaseService pr) {
        this.pr = pr;
    }

    @GetMapping(value="/getAllPurchases")
    public List<Purchase> getAllPurchases() {
        return pr.getAllPurchases();
    }

    @PostMapping(value="/addPurchase")
    public Purchase addPurchase(@RequestBody Purchase p) {
        return pr.add(p);
    }

}
