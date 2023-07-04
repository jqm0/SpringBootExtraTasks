package com.example.Chocolate_Manufacturing_Factory.ResponseObject;

import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import lombok.Builder;
@Builder
public class ProductResponeObj  {
    String name;
    String ingredients;
    double price;
    int quantity;
    Long id;
    public static ProductResponeObj convertToResponse(Product entity) {
        return ProductResponeObj.builder()
                .id(entity.getId())
                .ingredients(entity.getIngredients())
                .price(entity.getPrice())
                .quantity(entity.getQuantity())
                .build();
    }
}
