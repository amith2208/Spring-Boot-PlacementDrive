package com.example.Placement.controller;

import com.example.Placement.model.Shipping;
import com.example.Placement.service.ShippingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/Shipping")
@RestController
public class ShippingController {
    private final ShippingService sr;

    public ShippingController(ShippingService sr) {
        this.sr = sr;
    }

    @GetMapping(value="/getAllShippings")
    public List<Shipping> getAllShippings() {
        return sr.getAllShippings();
    }

    @PostMapping(value="/addShipping")
    public Shipping addShipping(@RequestBody Shipping s) {
        return sr.add(s);
    }

    @RequestMapping(path="/{city}")
    public List<Shipping> getAllCity(@PathVariable String city){
    return sr.getAllCity(city);
    }
}
