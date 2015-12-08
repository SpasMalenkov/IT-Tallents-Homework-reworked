package homework_01;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hour between 0 to 24: ");
		int hour = sc.nextInt();
		
		if(hour < 0 || hour > 24){
			
			hour = sc.nextInt();
			
		}
		if(((hour >= 0) && (hour < 4)) || ((hour >= 18) && (hour <= 24))){
			
			System.out.println("Good Evening!");
			
		}
		if(hour >= 4 && hour <= 9){
			
			System.out.println("Good Morning!");
			
		}
		if(hour > 9 && hour < 18){
			
			System.out.println("Good Afternoon!");
			
		}
	}

}
