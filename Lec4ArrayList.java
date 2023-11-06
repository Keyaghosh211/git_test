package javapractice;

import java.util.ArrayList;

public class Lec4ArrayList {

	public static void main(String[] args) {
		// arraylist is resizable
		//syntax ArrayList<datatype> veriable = newArrayList<datatype>();
		
		//code of arrylist
		 ArrayList<String> cars = new ArrayList<String>(); // create am ArrayList object
		 
		 // add the data
           cars.add("BMW");
           cars.add("Kia");
           cars.add("Nissan");
           cars.add ("Ford"); 
	       // access item
           System.out.println(cars.get(0));
           
           //change/excenage
           System.out.println(cars.set(0, "Bentley"));
           System.out.println(cars.size());
           
           System.out.println(cars);
           
	}
         
}
