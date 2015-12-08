package homework_01;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		float tempC = sc.nextFloat();
		
		if(tempC < -273){
			
			System.out.println("Not possible!");
			
		}
		if(tempC == -273){
			
			System.out.println("ABSOLUTE ZERO!!");
			
		}
		if(tempC > -273 && tempC <= -25){
			
			System.out.println("Ice cold.");
			
		}
		if(tempC > -25 && tempC <= 0){
			
			System.out.println("Cold.");
			
		}
		if(tempC > 0 && tempC <= 15){
			
			System.out.println("Chilly.");
			
		}
		if(tempC > 15 && tempC <= 25){
			
			System.out.println("Warm.");
			
		}
		if(tempC > 25){
			
			System.out.println("Hot.");
			
		}
	}

}
