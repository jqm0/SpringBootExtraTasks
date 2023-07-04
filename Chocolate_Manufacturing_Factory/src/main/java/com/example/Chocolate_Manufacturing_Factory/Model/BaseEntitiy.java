package com.example.Chocolate_Manufacturing_Factory.Model;

import javax.persistence.MappedSuperclass;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BaseEntitiy {
    Date createdDate;
    Date updatedDate;
    Boolean isActive;
}
