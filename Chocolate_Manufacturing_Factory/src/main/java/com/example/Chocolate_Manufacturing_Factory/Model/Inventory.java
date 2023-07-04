package com.example.Chocolate_Manufacturing_Factory.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Data
public class Inventory extends BaseEntitiy{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
     int productId;
     int quantityAvailable;

}
