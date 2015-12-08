package homework_02;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number N: ");
		int n;
		
		do{
			
			 n = sc.nextInt();
			 
		}while(n < 10 || n > 200);
		
		for(int i = n; i > 10; i--){
			
			if(i % 7 == 0 && i < n){
				
				System.out.println(i);
				
			}
		}
	}

}
