

import org.example.entity.Car;
import org.example.entity.Customer;
import org.example.entity.Engine;
import org.example.entity.FactoryAF;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryAFTest {

    @Test
    void testSaleCar() {
        List<Car> cars = new ArrayList<>();
        Engine engine1 = new Engine(10);
        Engine engine2 = new Engine(20);
        Engine engine3 = new Engine(30);
        Engine engine4 = new Engine(40);
        Engine engine5 = new Engine(50);
        cars.add(new Car(1, engine1));
        cars.add(new Car(2, engine2));
        cars.add(new Car(3, engine3));
        cars.add(new Car(4, engine4));
        cars.add(new Car(5, engine5));

        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Петров Михаил Викторович", cars.get(0));
        Customer customer2 = new Customer("Сидорова Анна Юрьевна", cars.get(1));
        Customer customer3 = new Customer("Кузнецова Елена Сергеевна", cars.get(2));
        Customer customer4 = new Customer("Иванов Сергей Александрович", cars.get(3));
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        FactoryAF factoryAF = new FactoryAF(cars, customers);
        factoryAF.saleCar();


        assertEquals(0, factoryAF.getCars().size());
        assertEquals(0, factoryAF.getCustomers().size());
    }
}
