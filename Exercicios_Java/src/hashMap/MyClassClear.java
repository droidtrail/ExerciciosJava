package hashMap;

import java.util.HashMap;

public class MyClassClear {

	public static void main(String[] args) {
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		capitalCities.put("England", "London");
		capitalCities.put("England", "UK");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		capitalCities.clear();
	
		System.out.println(capitalCities);

	}

}
