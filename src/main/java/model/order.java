package model;

import jakarta.persistence.Entity;
import org.hibernate.validator.constraints.UUID;

import java.util.List;


public class order {
    @UUID
    public String id;
   public List<product> items;
}
