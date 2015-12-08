package homework_02;

import java.util.Scanner;

public class Problem24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n , x, por;
		
		n = sc.nextLong();
		
		x= 0;
		por = n;
		
		do{
			
			x = x * 10 + por % 10;
			por = por / 10;
			
		}while(por > 0);
		
		if(x == n){
			
			System.out.println("Polindrom.");
		
		}
		else{
			
			System.out.println("Not polindrom.");
		
		}
	}

}
