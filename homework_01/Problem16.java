package homework_01;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a 3-digit number: ");
		int a = sc.nextInt();
		int digit = 0;
		int newNumber1 = 0;
		int newNumber2 = 0;
		int newNumber3 = 0;
		
		if(a < 100 || a > 999){
			
			System.out.print("Please enter a 3-digit number: ");
			a = sc.nextInt();
			
		}
		
		if(a > 0){
			
			if(a > 99 && a < 1000){
				digit = a % 10;
				newNumber1 += digit;
				a /= 10;
			}
			if(a > 9 && a < 100){
				digit = a % 10;
				newNumber2 += digit;
				a /= 10;
			}
			if(a > -1 && a < 10){
				digit = a % 10;
				newNumber3 += digit;
				a /= 10;
			}
		}
		
		if(newNumber1 > newNumber2 && newNumber2 > newNumber3){
			
			System.out.println("They are ascending!");
			
		}
		if(newNumber1 < newNumber2 && newNumber2 < newNumber3){
			
			System.out.println("They are descending!");
			
		}
		if(newNumber1 == newNumber2 && newNumber2 == newNumber3){
			
			System.out.println("They are even!");
			
		}
		if((newNumber1 > newNumber2 && newNumber2 < newNumber3) || (newNumber1 < newNumber2 && newNumber2 > newNumber3)){
			
			System.out.println("They are in disorder!");
			
		}
	}

}
