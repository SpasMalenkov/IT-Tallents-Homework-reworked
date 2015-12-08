package homework_01;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter position À:");
		int a = sc.nextInt();
		
		if(a < 0 || a > 8){
			
			System.out.println("Enter position À:");
			a = sc.nextInt();
			
		}
		
		System.out.println("Enter position Â:");
		int b = sc.nextInt();
		
		if(b < 0 || b > 8){
			
			System.out.println("Enter position Â:");
			b = sc.nextInt();
			
		}

		System.out.println("Enter position C:");
		int c = sc.nextInt();
		
		if(c < 0 || c > 8){
			
			System.out.println("Enter position C:");
			c = sc.nextInt();
			
			
		}
		
		System.out.println("Enter position D:");
		int d = sc.nextInt();
		
		if(d < 0 || d > 8){
			
			System.out.println("Enter position D:");
			d = sc.nextInt();
		
		}
		
		boolean color1 = false;
		boolean color2 = false;
		
		if((a + b) % 2 == 0){
			
			color1 = true;
			
		}
		else{
			
			color1 = false;
			
		}
		
		if((c + d) % 2 == 0){
			
			color2 = true;
			
		}
		else{
			
			color2 = false;
			
		}
		
		if(color1 == color2){
			
			System.out.println("The are the same color.");
			
		}
		else{
			
			System.out.println("The are diferent colors.");
			
		}
	}

}
