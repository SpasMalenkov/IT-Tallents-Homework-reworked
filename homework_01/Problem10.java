package homework_01;

import java.util.Scanner;

public class Problem10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bucket1 = 2;
		int bucket2 = 3;
		
		System.out.print("Enter a volume: ");
		int volume = sc.nextInt();
		
		int carry = volume / 5;
		int extra = volume % 5;
		int extraBucket = 0;
		
		if(extra % 2 == 0){
			
			extraBucket = extra / 2;
			
		}
		if(extra % 3 == 0){
			
			extraBucket = extra / 3;
			
		}
		
		if(carry != 0 && extra != 0){
			
			if(extra % 2 == 0 || extra % 3 == 0){
				
				System.out.println("You have to carry " + carry + " times "+ bucket1 + " bucket of 2 liters.");
				System.out.println("You have to carry " + carry + " times "+ bucket2 + " bucket of 3 liters.");
				
				if(extra % 2 == 0){
					
					System.out.println("You have to carry extra " + extraBucket + " bucket of " + bucket1 + " liter buckets.");
				
				}
				if(extra % 3 == 0){
					
					System.out.println("You have to carry extra " + extraBucket + " bucket of " + bucket2 + " liter buckets.");
				
				}
			
			}
			else{
				
				System.out.println("Can't fill the tank right.");
				
			}
			
		}
		if(carry != 0 && extra == 0){
			
			System.out.println("You have to carry " + carry + " times "+ bucket1 + " bucket of 2 liters.");
			System.out.println("You have to carry " + carry + " times "+ bucket2 + " bucket of 3 liters.");
			
		}
	}
	
}
