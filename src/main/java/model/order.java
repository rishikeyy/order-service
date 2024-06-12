package model;

import jakarta.persistence.Entity;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

@Entity
public class order {
    @UUID
    String id;
    List<product> items;
}
