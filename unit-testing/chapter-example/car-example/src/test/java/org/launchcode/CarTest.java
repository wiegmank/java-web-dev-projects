package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    Car test_car;
    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
        String car_message = test_car.toString();
    }

    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
        System.out.println(test_car.toString());
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

//    @Test
//    public void constructorCreatesCar() {
//        Car test_car = new Car("Toyota", "Supra", 15, 17.25);
//        assertEquals("Toyota", test_car.getMake());
//        assertEquals("Supra", test_car.getModel());
//        assertEquals(15, test_car.getGasTankSize());
//        assertEquals(17.25, test_car.getMilesPerGallon());
//    }


}