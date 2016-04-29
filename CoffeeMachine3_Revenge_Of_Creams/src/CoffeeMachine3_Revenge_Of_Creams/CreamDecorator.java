package CoffeeMachine3_Revenge_Of_Creams;

import java.util.ArrayList;

public class CreamDecorator extends Beverage{
	private Beverage beverage;
	
	public CreamDecorator(Beverage b) {
	 beverage = b;
	}


	public ArrayList<String> recipe() {
		ArrayList<String> s = beverage.recipe();
		s.add("cream");
		return s;
	}
	

	public float price() {
		return beverage.price() + (float)0.20;
	}

}
