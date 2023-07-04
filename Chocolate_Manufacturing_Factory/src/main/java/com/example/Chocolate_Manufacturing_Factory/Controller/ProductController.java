package com.example.Chocolate_Manufacturing_Factory.Controller;

import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import com.example.Chocolate_Manufacturing_Factory.RequestObject.ProductRequestObj;
import com.example.Chocolate_Manufacturing_Factory.Service.ProductService;
import com.example.Chocolate_Manufacturing_Factory.Service.productNotFoundException;
import com.example.Chocolate_Manufacturing_Factory.UpdateRequest.OrderUpdate;
import com.example.Chocolate_Manufacturing_Factory.UpdateRequest.ProductUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/api/products")
    public ResponseEntity<Void> CreateProduct (@RequestBody ProductRequestObj productRequestObj) {
        productService.addProduct(productRequestObj);
        return ResponseEntity.ok().build();

    }

    @PutMapping("/api/products/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable Long productId, @RequestBody ProductRequestObj productUpdate) {
        try {
            productService.update(productId,productUpdate);
            return ResponseEntity.ok("Todo item updated successfully");
        } catch (productNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

}
