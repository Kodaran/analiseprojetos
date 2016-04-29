package CoffeeMachine3_Revenge_Of_Creams;

import java.util.ArrayList;

public class Coffee extends Beverage{

	
	public ArrayList<String> recipe() {
		ArrayList<String> s = new ArrayList<String>();
		s.add("cup");
		s.add("coffee");
		s.add("sugar");
		s.add("water");
		return s;
	}

	
	public float price() {
		return (float) 0.35;
	}
	

}
