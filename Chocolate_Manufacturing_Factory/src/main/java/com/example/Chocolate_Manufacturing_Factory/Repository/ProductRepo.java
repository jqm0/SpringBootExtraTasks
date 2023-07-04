package com.example.Chocolate_Manufacturing_Factory.Repository;

import com.example.Chocolate_Manufacturing_Factory.Model.Order;
import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
