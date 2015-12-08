package homework_01;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a hour: ");
		int hour = sc.nextInt();
		
		if(hour>=1 && hour<=24){
			
			System.out.print("The hour is: " + hour);
		
		}else{
			
			System.out.println("Enter a valid hour: ");
			hour=sc.nextInt();
		
		}
		
		System.out.print("Money available: ");
		float money = sc.nextFloat();
		
		System.out.print("Am I healthy? ");
		boolean amIGood = false;
		
		if(amIGood = sc.nextBoolean()){
					
			System.out.print("I am not going out!");
					
			if(money >= 20){
					
				if(hour<7 || hour>=22){
							
					System.out.print("I have to find a nonstop pharmacy!");
						
				}else{
							
					System.out.print("I will buy meds from the pharmacy!");
						
				}
						
			}else{
						
				System.out.print("I will stay home and drink tea!");
					
			}
				
		}else{
					
			System.out.print("I am healthy!");
					
			if(money >=20){
						
				if(hour>21 && hour<=24){
							
					System.out.print("I will go to the bar!");
						
				}else if(hour>=1 && hour<=7){
							
					System.out.print("It's late to go out!");
						
				}else{
							
					System.out.print("I will go to the caffee!");
						
				}
					
			}else{
						
				System.out.print("Where am I going without money?!");
						
			}
					
		}
	}

}
