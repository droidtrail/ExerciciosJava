package hashMap;

import java.util.HashMap;

public class MyClassRemove {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");

		capitalCities.remove("England");

		System.out.println(capitalCities);

	}

}
