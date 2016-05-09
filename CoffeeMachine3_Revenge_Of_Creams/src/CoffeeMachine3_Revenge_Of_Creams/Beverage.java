package coffemachine.machine;

import java.util.ArrayList;

public abstract class Beverage {
	public abstract ArrayList<String> recipe(String type, int amaunt);
	public abstract float price();

}
