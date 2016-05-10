package coffemachine.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import coffemachine.machine.Beverage;
import coffemachine.machine.Ingredient;
import coffemachine.machine.Machine;
import coffemachine.machine.Tea;
import coffemachine.machine.TeaLemon;



public class TestCoffeeMachine {

	@Test
	public void depositCoinTest() {
		Machine machine = new Machine();
		machine.newMoeda10();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		machine.newMoeda25();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		assertEquals("0.35", machine.showMessageInDisplay());
		
		
	}

	@Test
	public void pressButtonCoffe() {
		Machine machine = new Machine();
		assertEquals("Café", machine.pressButtonCoffe());
	}

	@Test
	public void combineIngredients() {
		Machine machine = new Machine();
		assertEquals("Pronto", machine.coffeIsReady());
	}

	@Test
	public void pressButtonCoffeWithoutMoney() {
		Machine machine = new Machine();
		if (machine.checkAmountOfCoinsValue() < 0.35) {
			machine.setMessageInDisplay("Valor insuficiente");
			assertEquals("Valor insuficiente", machine.showMessageInDisplay());
		}

	}
	
	@Test
	public void testTeaLemon() {
		
		String type = "";
		int amount = 0;
		Ingredient i = new Ingredient(type, amount);
		Beverage b = null;
			
		Machine machine = new Machine();
		machine.newMoeda10();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		machine.newMoeda25();
		machine.setMessageInDisplay(machine.checkAmountOfCoinsValue().toString());
		assertEquals("0.35", machine.showMessageInDisplay());
//		
//		tea.mixTea("Copo", 1);
//		tea.mixTea("Água", 100);
//		tea.mixTea("Pó de chá", 20);
//		machine.setMessageInDisplay("Pronto");
//		assertEquals("Pronto", machine.showMessageInDisplay());
		
			String expected = "cup powder water lemon";
			b = new TeaLemon(new Tea());
			assertEquals(expected, i.prepare(b));
			assertEquals((float)0.45, b.price(),0);
		
		
	}

}
