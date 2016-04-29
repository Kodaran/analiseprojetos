package CoffeeMachine3_Revenge_Of_Creams;

public class Mixer {
	
	public String prepare(Beverage b){
		String result = "";
		for (String s: b.recipe()) {
			result = result + s + " ";
		}
		return result.trim();
	}

}
