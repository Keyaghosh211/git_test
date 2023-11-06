package javapractice;

public class Lec3Array {

	public static void main(String[] args) {
		// Array = 1. wehere we can store multiple data in one veriable
		// 2. array is fixed
		
	//String fruit1= "mango";
		String [] Fruits = {"mango", "watermelon", "Orage", "Apple",};
		
		//store 4 cars by using array
		String [] Cars = {"BMW", "Honda","Kia","Toyota"};
		//access data in array
		System.out.println(Cars[2]);
		
		//how to change data in array
		Cars [0]="Nissan";
		System.out.println(Cars[0]);
		
		//length of array
		System.out.println(Cars.length);
		}

	
}
