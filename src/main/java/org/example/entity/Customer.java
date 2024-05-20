package org.example.entity;

import lombok.Data;

@Data
public class Customer {
    private final String FIO;
    private Car car;
    public Customer(String FIO) {
        this.FIO = FIO;
    }

    public Customer(String FIO, Car car) {
        this.FIO = FIO;
        this.car = car;
    }
}
