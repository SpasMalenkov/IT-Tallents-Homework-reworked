package homework_02;

import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		do{
			
			System.out.print("Enter a number: ");
			a = sc.nextInt();
		
		}while(a < 1 || a > 999);
		
		int count = 0;
		int position = 1;
		
		while(count < 10){
			
			if((a % 2 == 0) || (a % 3 == 0) || (a % 5 == 0)){
				
				System.out.println(position + ": " + a);
				position++;
				count+=1;
				
			}
			
			a++;
			
		}
	}

}
