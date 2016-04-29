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

        String blackCoffe = "Café preto";
        String coffeWithSugar = "Café com açucar";
        String coffeWithCream = "Café com creme";
        String coffeWithCreamAndSugar = "Café com creme e açucar";

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        assertEquals(blackCoffe, coffeeMachine.prepareNewCoffe("Café preto"));
        assertEquals(coffeWithSugar, coffeeMachine.prepareNewCoffe("Café com açucar"));
        assertEquals(coffeWithCream, coffeeMachine.prepareNewCoffe("Café com creme"));
        assertEquals(coffeWithCreamAndSugar, coffeeMachine.prepareNewCoffe("Café com creme e açucar"));
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
