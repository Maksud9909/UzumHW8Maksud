package org.example.entity;

import lombok.Data;

import java.util.Iterator;
import java.util.List;

@Data
public class FactoryAF {
    private List<Car> cars;
    private List<Customer> customers;
    private int number = 0;

    public FactoryAF(List<Car> cars, List<Customer> customers) {
        this.cars = cars;
        this.customers = customers;
    }

    public void addCar(Integer engineSize) {
        Car car = new Car(number++, engineSize);
        cars.add(car);
    }

    public void saleCar() {
        Iterator<Customer> iterator = customers.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            Car customerCar = customer.getCar();
            if (customerCar != null && cars.contains(customerCar)) {
                iterator.remove();
                cars.remove(customerCar);
            }
        }
        if (!cars.isEmpty()) {
            System.out.println(cars + " оставшиеся автомобили из коллекции. Они будут удалены. ");
            cars.clear();
        }
    }
}
