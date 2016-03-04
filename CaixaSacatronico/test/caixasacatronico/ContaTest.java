package caixasacatronico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContaTest {

    public ContaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSacar() {

        Conta conta = new Conta("Douglas", 1, 1000);

        double valorSaque = 1100;

        boolean saque = conta.sacar(valorSaque);

        assertEquals(false, saque);

    }

}
