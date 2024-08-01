package org.example.entity;

import lombok.Data;

@Data
public class Car {
    private int number;
    private Engine engine;

    public Car(int number, int engineSize) {
        this.number = number;
        this.engine = new Engine(engineSize);
    }
}
