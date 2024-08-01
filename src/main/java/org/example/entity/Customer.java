package org.example.entity;

import lombok.Data;

@Data
public class Customer {
    private String FIO;
    private Car car;

    public Customer(String FIO) {
        this.FIO = FIO;
    }
}
