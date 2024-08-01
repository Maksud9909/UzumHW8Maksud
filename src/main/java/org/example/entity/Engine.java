package org.example.entity;

import lombok.Data;

@Data
public class Engine {
    int size;
    public Engine(int size) {
        this.size = size;
    }
}
