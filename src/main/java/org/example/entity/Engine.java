package org.example.entity;

import lombok.Data;

@Data
public class Engine {
    final int size;

    public Engine(int size) {
        this.size = size;
    }
}
