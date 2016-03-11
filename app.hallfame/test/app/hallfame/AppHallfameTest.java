package app.hallfame;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppHallfameTest {

    public AppHallfameTest() {
    }

    @Test
    public void testEmptyHallOfFame() {
        HalldaFama hall = new HalldaFama();
        String expected = "Ninguém Jogou Ainda";
        Player[] players = hall.top10();

        assertEquals(1, players.length);
        assertEquals(expected, players[0].getNome());

    }

}
