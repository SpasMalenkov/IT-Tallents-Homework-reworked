package homework_01;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Въведете число A:");
		int a = sc.nextInt();

		System.out.print("Въведете число B:");
		int b = sc.nextInt();
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
