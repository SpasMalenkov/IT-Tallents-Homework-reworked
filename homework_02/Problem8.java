package homework_02;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		do {
			
			System.out.println("Enter n:");
			n = sc.nextInt();
			
		} while (n < 0);
		
		int toPrint = n-1;

		for(int i=0; i < n; ++i) {
			
			for(int j=0; j < n; ++j) {
				
				System.out.print(toPrint);
				
			}
			
			System.out.println();
			
			toPrint += 2;
			
		}
		
	}

}
