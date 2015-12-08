package homework_02;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a;
		int b;
		
		do{
			
			a = sc.nextInt();
			
		}while(a < 10 && a > 5555);
		
		do{
			
			b = sc.nextInt();
			
		}while(b < a && b > 5555);
		
		for(int i = b; i > a; i--){
			
			if(i % 50 == 0){
				
				System.out.println(i);
				
			}
		}
	}

}
