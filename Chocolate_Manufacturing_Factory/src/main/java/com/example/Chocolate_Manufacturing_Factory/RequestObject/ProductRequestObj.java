package com.example.Chocolate_Manufacturing_Factory.RequestObject;


import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductRequestObj  {
    String name;
    String ingredients;
    double price;
    int quantity;



    public static Product convertToEntity(Product entity, ProductRequestObj request){
        entity.setName(request.getName());
        entity.setIngredients(request.getIngredients());
        entity.setPrice(request.getPrice());
        entity.setQuantity(request.getQuantity());
        return entity;
    }
}
