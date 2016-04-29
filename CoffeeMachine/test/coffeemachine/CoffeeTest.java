package coffeemachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTest {

    @Test
    public void prepareAllCoffes() {

        String blackCoffe = "Caf� preto";
        String coffeWithSugar = "Caf� com a�ucar";
        String coffeWithCream = "Caf� com creme";
        String coffeWithCreamAndSugar = "Caf� com creme e a�ucar";

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        assertEquals(blackCoffe, coffeeMachine.prepareNewCoffe("Caf� preto"));
        assertEquals(coffeWithSugar, coffeeMachine.prepareNewCoffe("Caf� com a�ucar"));
        assertEquals(coffeWithCream, coffeeMachine.prepareNewCoffe("Caf� com creme"));
        assertEquals(coffeWithCreamAndSugar, coffeeMachine.prepareNewCoffe("Caf� com creme e a�ucar"));
    }

    @Test
    public void paymentWithTheSameValue() {
        Payment pay = new Payment();
        assertEquals(0.35, pay.coffeePayment(pay, 0.35));
    }

    @Test
    public void paymentWithMoreValue() {
        Payment pay = new Payment();
        assertEquals(1.00, pay.coffeePayment(pay, 1.00));

    }

    @Test
    public void insuficientMoney() {
        Payment pay = new Payment();
        assertEquals(0, pay.coffeePayment(pay, 0));
    }

}
