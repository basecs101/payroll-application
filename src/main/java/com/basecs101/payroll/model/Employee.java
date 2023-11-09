package com.basecs101.payroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Employee")
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String firstName;
    private String lastName;
    private String role;

    public Employee(String name, String role) {

        this.name = name;
        this.role = role;
    }

    public Employee(String firstName, String lastName, String role) {
        this.name = firstName + " " + lastName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        String[] parts = name.split(" ");
        if (parts.length > 1){
            this.firstName = parts[0];
            this.lastName = parts[1];
        } else {
            this.firstName = parts[0];
        }
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}