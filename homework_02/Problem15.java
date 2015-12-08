package homework_02;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= a; i++){
			
			sum = sum + i;
			
		}
		
		System.out.println("The sum from 1 to " + a + " is " + sum + ".");
		
	}

}
