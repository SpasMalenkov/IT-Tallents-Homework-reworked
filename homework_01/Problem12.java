package homework_01;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Day = ");
		int day = sc.nextInt();
		
		System.out.print("Month = ");
		int month = sc.nextInt();
		
		System.out.print("Year = ");
		int year = sc.nextInt();
		
		int endOfMonth = 0;
		
		if(month == 2){
			
			if(((year % 4 == 0) && (year % 100 != 0)) || (year% 400 == 0)){
				
				endOfMonth = 29;
				
			}
			else{
				
				endOfMonth = 28;
				
			}
		}
		else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
			
			endOfMonth = 30;
			
		}
		else{
			
			endOfMonth = 31;
		
		}
		
		if(day < endOfMonth){
			
			day++;
		
		}
		else{
			
			day = 1;
			if(month < 12){
				
				month++;
				
			}
			else{
				
				month = 1;
				year++;
				
			}
		}
		
		System.out.println(day + ", " + month + ", " + year);
	}

}
