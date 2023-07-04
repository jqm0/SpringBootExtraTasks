package com.example.Chocolate_Manufacturing_Factory.Model;

import javax.persistence.*;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Data
public class Product extends BaseEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String ingredients;
    double price;
    int quantity;
}
