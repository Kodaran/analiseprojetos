package dados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Dado2Test {
    
    public Dado2Test() {
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
    public void testRolar() {

        Dado2 dado2 = new Dado2();
        
        int resultado = dado2.rolar();
        
        assertTrue(resultado == 1 || resultado == 2 || resultado == 3 ||  resultado == 4 || resultado == 5 || resultado == 6);

        assertEquals(resultado, resultado);

    }
    
}
