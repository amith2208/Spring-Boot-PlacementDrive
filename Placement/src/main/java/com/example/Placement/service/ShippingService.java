package com.example.Placement.service;

import com.example.Placement.model.Shipping;
import com.example.Placement.repositories.ShippingRepo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

@Service
public class ShippingService {

    private final ShippingRepo sr;

    // public ShippingService()
    // {

    // }

    public ShippingService(ShippingRepo sr) {
        this.sr = sr;
    }

    public List<Shipping> getAllShippings() {
        System.out.println(sr.findAll());
        return sr.findAll();
        
    }

    public Shipping add(Shipping s) {
        return sr.save(s);
    }
    public List<Shipping> getAllCity(String city){
    //     List<Shipping> ship =getAllShippings();
    // return ship.stream()
    //                     .filter(shipp -> city.equals(shipp.getCity()))
    //                     .findFirst()
    //                     .orElseThrow(IllegalArgumentException::new);
        return sr.findByCity(city);

    }

}
