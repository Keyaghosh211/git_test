package javapractice;

import java.util.HashMap;

public class Lec5Hashmap {

	public static void main(String[] args) {
		//HashMap<String,String> CapitalCities = new HashMap<String, String>(); 
		//store 4 city and state name
		HashMap<String, String> Cities = new HashMap<String, String> ();
		Cities.put("irving", "TX");
		Cities.put("NYC","Ny");
		Cities.put("LA","CA");
		Cities.put("ATLANTA", "GA");
		
		//Access Itim
		//Cities.get("irving");
		System.out.println(Cities.get("irving"));
        
	}

}
