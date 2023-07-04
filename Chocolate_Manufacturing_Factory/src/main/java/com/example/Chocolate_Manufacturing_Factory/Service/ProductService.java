package com.example.Chocolate_Manufacturing_Factory.Service;

import com.example.Chocolate_Manufacturing_Factory.Model.BaseEntitiy;
import com.example.Chocolate_Manufacturing_Factory.Model.Product;
import com.example.Chocolate_Manufacturing_Factory.Repository.ProductRepo;
import com.example.Chocolate_Manufacturing_Factory.RequestObject.ProductRequestObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public void addProduct(ProductRequestObj productRequestObj) {
        Product product = new Product();
        product.setName(productRequestObj.getName());
        product.setIsActive(true);
        product.setCreatedDate(new Date());
        product.setIngredients(productRequestObj.getIngredients());
        product.setQuantity(productRequestObj.getQuantity());
        product.setPrice(productRequestObj.getPrice());
        productRepo.save(product);
    }

    public void update(Long productID, String name , String ingredients , Double price , Integer quantity ) {
        Optional<Product> optionalProduct = productRepo.findById(productID);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setName(name);
            product.setIngredients(ingredients);
            product.setPrice(price);
            product.setQuantity(quantity);
            productRepo.save(product);
        } else {
            throw new productNotFoundException("Todo item not found with ID: " + productID);

    }}}


