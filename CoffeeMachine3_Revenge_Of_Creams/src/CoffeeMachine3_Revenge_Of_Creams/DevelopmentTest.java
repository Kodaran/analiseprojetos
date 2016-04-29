package CoffeeMachine3_Revenge_Of_Creams;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DevelopmentTest {

	Mixer mixer;
	Beverage beverage;
	
	@Before
	public void setUp() throws Exception{
		mixer = new Mixer();
	}
	
	@After
	public void tearDown() throws Exception{
		mixer = null;
		beverage = null;
	}
	@Test
	public void testSimpleCoffee() {
		beverage = new Coffee();
		String expected = "cup coffee sugar water";
		assertEquals(expected, mixer.prepare(beverage));
		assertEquals((float)0.35, beverage.price(),0);
	}
	
	@Test
	public void testCoffeWithExtraCream(){
		beverage = new CreamDecorator(new Coffee());
		String expected = "cup coffee sugar water cream";
		assertEquals(expected, mixer.prepare(beverage));
		assertEquals((float)0.55, beverage.price(),0);
		
	}
	@Test
	public void testCoffeWithDoubleCream(){
		beverage = new CreamDecorator(
						new CreamDecorator(
							new Coffee()));
		String expected = "cup coffee sugar water cream cream";
		assertEquals(expected, mixer.prepare(beverage));
		assertEquals((float)0.75, beverage.price(),0);
		
	}
	
	@Test
	public void testCoffeWithPepper(){
		String expected = "cup coffee sugar water pepper";
		beverage = new PepperDecorator(new Coffee());
		assertEquals(expected, mixer.prepare(beverage));
		assertEquals((float)0.45, beverage.price(),0);
	}
	
}
