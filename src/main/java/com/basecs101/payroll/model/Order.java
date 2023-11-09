package com.basecs101.payroll.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Order {
    private @Id
    @GeneratedValue Long id;
    private String description;
    private Status status;
    public Order(String description, Status status) {

        this.description = description;
        this.status = status;
    }
}
