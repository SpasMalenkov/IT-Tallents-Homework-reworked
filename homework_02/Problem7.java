package homework_02;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		
		int l = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= Integer.MAX_VALUE; i++) {
			
			if(i % 3 == 0) {
				
				System.out.print(i + ",");
				count++;
				
			}
			
			if(count == l){
				
				break;
			
			}
			
		}
		
	}

}
