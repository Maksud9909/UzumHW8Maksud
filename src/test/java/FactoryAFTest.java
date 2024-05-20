

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
        cars.add(new Car(1, 10));
        cars.add(new Car(2, 20));
        cars.add(new Car(3, 30));
        cars.add(new Car(4, 40));
        cars.add(new Car(5, 50));

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
