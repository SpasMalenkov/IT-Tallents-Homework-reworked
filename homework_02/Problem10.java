package homework_02;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Въведете число: ");
		int a = sc.nextInt();
	
		int c = 0;
		
		for(c = 2; c <= a / 2; c++){
			
			if(a % c == 0){
				
				System.out.print("ne");
				break;
			
			}
		}
		
		if(c == (a / 2) + 1){
			
			System.out.print("da");
			
		}
		
	}

}
