package hashMap;

import java.util.HashMap;

public class MyClassLoopValues {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		// Use the keySet() method if you only want the keys
		for (String i : capitalCities.keySet()) {

			System.out.println(i);

		}

	}

}
