package homework_02;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int sum;
		do{
			
			System.out.print("Enter a number: ");
			 sum = sc.nextInt();
			 
		}while(sum < 1 || sum > 27);
		
		int number = 0;
		int newNumber1;
		int newNumber2;
		int newNumber3;
		
		for(int i = 100; i < 1000; i++){
			
			number = i;
			while(number > 0){
				
				newNumber1 = number % 10;
				number /= 10;
				newNumber2 = number % 10;
				number /= 10;
				newNumber3 = number % 10;
				number /= 10;
				
				if((newNumber1 + newNumber2 + newNumber3) == sum){
					
					System.out.println(i);
					
				}
			}
		}
		
		
	}

}
