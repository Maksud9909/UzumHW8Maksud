package org.example.main;

import org.example.entity.Car;
import org.example.entity.Customer;
import org.example.entity.FactoryAF;


import java.util.ArrayList;
import java.util.List;
/**
 * Юнит тесты написаны в папке test
 */
public class Main {
    public static void main(String[] args) {
        List<Car> cars = addFiveCars();
        List<Customer> customers = addFourCustomers();
        FactoryAF factoryAF = new FactoryAF(cars,customers);
        System.out.println("Автомобили до продажи:");
        System.out.println(cars);

        System.out.println("Клиенты до продажи:");
        System.out.println(customers);

        System.out.println("-------");

        factoryAF.saleCar();

        System.out.println("Автомобили после продажи:");
        System.out.println(cars);

        System.out.println("Клиенты после продажи:");
        System.out.println(customers);
    }



    static List<Car> addFiveCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1,10));
        cars.add(new Car(2,20));
        cars.add(new Car(3,30));
        cars.add(new Car(4,40));
        cars.add(new Car(5,50));
        return cars;
    }

    static List<Customer> addFourCustomers(){
        List<Customer> customers = new ArrayList<>();
        Car car1 = new Car(1,10);
        Car car2 = new Car(2,20);
        Car car3 = new Car(3,30);
        Car car4 = new Car(4,40);

        Customer customer1 = new Customer("Петров Михаил Викторович");
        customer1.setCar(car1);
        Customer customer2 = new Customer("Сидорова Анна Юрьевна");
        customer2.setCar(car2);
        Customer customer3 = new Customer("Кузнецова Елена Сергеевна");
        customer3.setCar(car3);
        customers.add(customer3);

        Customer customer4 = new Customer("Иванов Сергей Александрович");
        customer4.setCar(car4);
        customers.add(customer4);

        return customers;
    }
}






