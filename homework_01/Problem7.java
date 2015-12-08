package homework_01;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Час: ");
		int hour = sc.nextInt();
		
		if(hour>=1 && hour<=24){
			
			System.out.print("Часът е " + hour);
		
		}else{
			
			System.out.println("Въведи правилен час: ");
			hour=sc.nextInt();
		
		}
		
		System.out.print("Налична сума: ");
		float money = sc.nextFloat();
		
		System.out.print("Дали съм здвав? ");
		boolean amIGood = false;
		
		if(amIGood = sc.nextBoolean()){
					
			System.out.print("Няма да излизам!");
					
			if(money >= 20){
					
				if(hour<7 || hour>=22){
							
					System.out.print(" Да си намеря денонощна аптека!");
						
				}else{
							
					System.out.print(" Ще си купя лекарствата от аптеката!");
						
				}
						
			}else{
						
				System.out.print(" Ще си стоя вкъщи и ще пия чай!");
					
			}
				
		}else{
					
			System.out.print("Здрав съм!");
					
			if(money >=20){
						
				if(hour>21 && hour<=24){
							
					System.out.print(" Ще изляза на бар!");
						
				}else if(hour>=1 && hour<=7){
							
					System.out.print(" Късно е да излизам!");
						
				}else{
							
					System.out.print(" Ще изляза на кафе!");
						
				}
					
			}else{
						
				System.out.print(" Къде отивам без пари?!");
						
			}
					
		}
	}

}
