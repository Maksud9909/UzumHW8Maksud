package org.example.entity;

import lombok.Data;

import java.util.Iterator;
import java.util.List;


@Data
public class FactoryAF {
    List<Car> cars;
    List<Customer> customers;

    public FactoryAF(List<Car> cars, List<Customer> customers) {
        this.cars = cars;
        this.customers = customers;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void saleCar() {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            Car car = customer.getCar();
            if (car !=null && cars.contains(car)) {
                iterator.remove();
                cars.remove(customer.getCar());
            }
        }
        if (!cars.isEmpty()) {
            System.out.println(cars + " оставшиеся автомобили из коллекции. Они будут удалены. ");
            cars.clear();
        }
    }
}
