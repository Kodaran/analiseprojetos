package coffemachine.machine;

import java.util.ArrayList;

public class Tea extends Beverage{

	@Override
	public ArrayList<String> recipe(String type, int amaunt) {
		ArrayList<String> s = new ArrayList<String>();
		s.add("cup");
		s.add("powder");
		s.add("water");
		return s;
	}

	@Override
	public float price() {
		return (float) 0.35;
	}

}
