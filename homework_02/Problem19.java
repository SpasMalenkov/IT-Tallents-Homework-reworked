package homework_02;

import java.util.Scanner;

public class Problem19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a;
		
		do{
			
			System.out.print("Enter a number: ");
			a = sc.nextDouble();
			
		}while(a < 10 && a > 99);
		
		
		do
		{
			if(a % 2 == 0){
				
				a = a * 0.5;
				System.out.print(a + " ");
				
			}
			
			if(a % 2 != 0 && a != 1){
				
				a = (a * 3) + 1;
				System.out.print(a + " ");
				
			}
			
		}while(a != 1);
		
	}

}
