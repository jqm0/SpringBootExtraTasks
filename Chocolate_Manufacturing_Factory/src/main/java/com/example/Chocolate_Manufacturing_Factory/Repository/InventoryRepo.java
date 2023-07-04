package com.example.Chocolate_Manufacturing_Factory.Repository;

import com.example.Chocolate_Manufacturing_Factory.Model.Inventory;
import com.example.Chocolate_Manufacturing_Factory.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Long> {
}
