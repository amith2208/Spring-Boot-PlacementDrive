package com.example.Placement.service;

import com.example.Placement.model.Purchase;
import com.example.Placement.repositories.PurchaseRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    private final PurchaseRepo pr;

    public PurchaseService(PurchaseRepo pr) {
        this.pr = pr;
    }

    public List<Purchase> getAllPurchases() {
        return pr.findAll();
    }

    public Purchase add(Purchase p) {
        return pr.save(p);
    }

}
