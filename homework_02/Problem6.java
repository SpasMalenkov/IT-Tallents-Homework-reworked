package homework_02;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n=");
		int n = sc.nextInt();
		
		int sum = 0;
		if(n > 0){
			
			for(int i = 1; i <= n ; i++) {
				
				sum = sum + i;
				
			}
			
		}
		if(n < 0){
			
			for(int i = 1; i >= n ; i-- ) {
				
				sum = sum + i;
				
			}
			
		}
		
		System.out.println("The sum of the numbers from 1 to " + n + " is " + sum + ".");
		
	}

}
