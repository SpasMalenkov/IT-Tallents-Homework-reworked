package homework_01;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a number À:");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter a number B:");
//		int b = sc.nextInt();
//		
//		int c = a + b;
//		System.out.println("The sum is: " + c);
//		
//		int d = a * b;
//		System.out.println("The product is: " + d);
//		
//		int e = a - b;
//		System.out.println("The difference is: " + e);
//		
//		int f = a % b;
//		System.out.println("The division with remainder is: " + f);
//		
//		int g = a / b;
//		System.out.println("The division is: " + g);
		
		System.out.println("Enter a number À:");
		float a = sc.nextFloat();
		
		System.out.println("Enter a number B:");
		float b = sc.nextFloat();
		
		float c = a + b;
		System.out.println("The sum is: " + c);
		
		float d = a * b;
		System.out.println("The product is: " + d);
		
		float e = a - b;
		System.out.println("The difference is: " + e);
		
		float f = a % b;
		System.out.println("The division with remainder is: " + f);
		
		float g = a / b;
		System.out.println("The division is: " + g);
	}

}
