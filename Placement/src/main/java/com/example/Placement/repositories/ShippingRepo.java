package com.example.Placement.repositories;

import com.example.Placement.model.Shipping;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepo extends JpaRepository<Shipping, String> {
     public List<Shipping> findByCity(String city);
  
}
