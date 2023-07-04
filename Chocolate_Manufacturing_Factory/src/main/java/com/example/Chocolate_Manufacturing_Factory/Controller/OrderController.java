package com.example.Chocolate_Manufacturing_Factory.Controller;

import com.example.Chocolate_Manufacturing_Factory.Model.Order;
import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import com.example.Chocolate_Manufacturing_Factory.RequestObject.OrderRequestObj;
import com.example.Chocolate_Manufacturing_Factory.RequestObject.ProductRequestObj;
import com.example.Chocolate_Manufacturing_Factory.Service.OrderService;
import com.example.Chocolate_Manufacturing_Factory.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("api/orders")
    public ResponseEntity<Void> createOrder (@RequestBody OrderRequestObj orderRequestObj) {
        addNewOrder(orderRequestObj);
        return ResponseEntity.ok().build();
    }
    public void addNewOrder(OrderRequestObj orderRequestObj){
        Order order = new Order();
        order.setQuantity(orderRequestObj.getQuantity());
        order.setId(orderRequestObj.getProduct_id());

        orderService.addOrder(order);
    }
    //
}
