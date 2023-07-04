package com.example.Chocolate_Manufacturing_Factory.Service;

import com.example.Chocolate_Manufacturing_Factory.Model.BaseEntitiy;
import com.example.Chocolate_Manufacturing_Factory.Model.Order;
import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import com.example.Chocolate_Manufacturing_Factory.Repository.OrderRepo;
import org.springframework.stereotype.Service;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Service
public class OrderService  {
    OrderRepo orderRepo;
    public void addOrder(Order order) {
        orderRepo.save(order);
    }
}
