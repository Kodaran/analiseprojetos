package coffemachine.machine;

import java.util.ArrayList;
import java.util.List;

public class TeaLemon extends Beverage{
	
	private Panel panel;
	private SafeBox safeBox;
	private List<Ingredient> ingredients;
	private Beverage myBeverage;
	
	public Panel getPanel() {
		return panel;
	}
	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	public SafeBox getSafeBox() {
		return safeBox;
	}
	public void setSafeBox(SafeBox safeBox) {
		this.safeBox = safeBox;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	public TeaLemon(Beverage b){
		myBeverage = b;
		SafeBox safeBox = new SafeBox();
		Panel panel = new Panel();
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		this.ingredients = ingredients;
		this.panel = panel;
		this.safeBox = safeBox;
//		
//		Ingredient cup = new Ingredient("Copo", 1);
//		Ingredient water = new Ingredient("Àgua", 100);
//		Ingredient teaPowder = new Ingredient("Pó de chá", 20);
//		
//		this.ingredients.add(cup);
//		this.ingredients.add(water);
//		this.ingredients.add(teaPowder);
		
	}
	
//	public void mixTea(String type, int amaunt){
//		List<Ingredient> ingredients = new ArrayList<Ingredient>();
//		Ingredient ingredient = new Ingredient(type,amaunt);
//		ingredients.add(ingredient);
//	}
	
	public ArrayList<String> recipe(String type, int amaunt) {
		ArrayList<String> s = myBeverage.recipe(type, amaunt);
		s.add("lemon");
		return s;
	}
	
	public float price() {
		return myBeverage.price() + (float) 0.10;
	}


}

