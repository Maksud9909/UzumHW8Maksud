

import org.example.entity.Car;
import org.example.entity.Customer;

import org.example.entity.FactoryAF;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryAFTest {

    @Test
    void testSaleCar() {
        Car car1 = new Car(1,10);
        Car car2 = new Car(2,20);
        Car car3 = new Car(3,30);
        Car car4 = new Car(4,40);
        List<Car> cars = new ArrayList<>(List.of(car1, car2, car3, car4));

        List<Customer> customers = new ArrayList<>();
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
