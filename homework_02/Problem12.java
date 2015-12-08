package homework_02;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
				
				if(newNumber1 != newNumber2 && newNumber2 != newNumber3 && newNumber3 != newNumber1){
					
					System.out.println(i);
					
				}
			}
		}
		
	}

}
