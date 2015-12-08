package homework_02;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number A: ");
		int a = sc.nextInt();
		
		System.out.println("Enter a number B: ");
		int b = sc.nextInt();
		
		int i=0;
		int sum=0;
		for(i = a; i <= b; i+=1){
			
			if((i*i) % 3 == 0){
				
				System.out.print("Skip - " + i + ", ");
				
			}else{
				
				System.out.print(i*i  + ", ");	
			
			}
			
			sum+=(i*i) - ((i*i)%3);
			
			if(sum>200){
			
				break;
			
			}
			
		}
	}

}
