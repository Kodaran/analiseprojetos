package dados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JogoTest {

    public JogoTest() {
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
    public void testJogar() {

        int valor1 = 1;
        int valor2 = 6;
        Jogo jogo = new Jogo();        
        boolean resultado = jogo.jogar(valor1, valor2);
        
        assertEquals(true, resultado);
    }
}
