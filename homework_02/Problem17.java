package homework_02;

import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int br;
		char ch;
		
		do{
			
			System.out.print("Enter the length of the sides: ");
			br = sc.nextInt();
		
		}while(br < 3 || br > 20);
		
		System.out.print("Enter symbol: ");
		ch = sc.next().charAt(0);
		
		for(int i = 0; i < br; i++){
			
			System.out.print("*");
			
		}
		
		System.out.println();
		
		for(int j = 0; j < br - 2; j++){
			
			System.out.print("*");
			
			for(int k = 0; k < br - 2; k++){
				
				System.out.print(ch);
			
			}
			
			System.out.print("*");
			
			System.out.println();
		}
		
		for(int i = 0; i < br; i++){
			
			System.out.print("*");
			
		}
		
	}

}
