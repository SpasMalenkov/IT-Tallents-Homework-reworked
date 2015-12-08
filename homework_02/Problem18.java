package homework_02;

import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		int product = 0;
		
		do{
			System.out.print("Enter first number: ");
			a = sc.nextInt();
			
			
		}while(a < 1 || a > 9);
		
		do{
			
			System.out.print("Enter second number: ");
			b = sc.nextInt();
			
		}while(b < 1 || b > 9);
		
		for(int i = 1; i <= a; i++){
			
			for(int j = 1; j <= b; j++){
				
				product = i * j;
				System.out.println(i + " * " + j + " = " + product);
				
			}
		}
	}

}
