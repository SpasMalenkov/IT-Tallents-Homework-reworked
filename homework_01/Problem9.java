package homework_01;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		System.out.print("Enter a number: ");
		int b = sc.nextInt();
		
		
		
		if(a < 10 || a > 99){
			
			a = sc.nextInt();
			
		}
		if(b < 10 || b > 99){
			
			b = sc.nextInt();
			
		}
		
		int digit = 0;
		int newNumber = 0;
		int c = 0;
		
		c = a*b;
		
		digit = c % 10;
		
		if(digit % 2 == 0){
			
			System.out.println(c + ", " + digit + ", " + "it's even.");
			
		}
		else{
			
			System.out.println(c + ", " + digit + ", " + "it's odd.");
			
		}
	}

}
