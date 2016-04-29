package CoffeeMachine3_Revenge_Of_Creams;

import java.util.ArrayList;

public class PepperDecorator extends Beverage{
	private Beverage beverage;
	
	public PepperDecorator(Beverage b){
		beverage = b;
		
	}
	
	public ArrayList<String> recipe() {
		ArrayList<String> s = beverage.recipe();
		s.add("pepper");
		return s;
	}

	
	public float price() {
		return beverage.price() + (float)0.10;
	}

}


