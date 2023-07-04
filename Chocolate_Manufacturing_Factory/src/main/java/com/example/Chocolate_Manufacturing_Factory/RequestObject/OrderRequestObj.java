package com.example.Chocolate_Manufacturing_Factory.RequestObject;

import com.example.Chocolate_Manufacturing_Factory.Model.BaseEntitiy;
import com.example.Chocolate_Manufacturing_Factory.Model.Order;
import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderRequestObj {
    Long product_id;
    Integer quantity ;
    String shipping_address;
    public static Order convertToEntity(Order entity, OrderRequestObj request){
        entity.setQuantity(request.getQuantity());
        entity.setShipping_address(request.getShipping_address());
        return entity;
    }
}
