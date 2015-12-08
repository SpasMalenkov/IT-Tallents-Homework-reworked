package homework_02;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("n=");
		int n = sc.nextInt();
		
		System.out.print("m=");
		int m = sc.nextInt();
		
		int i = 0;
		
		if(n > m){
			
			i = m;
			
			do{
				
				System.out.print(i + ",");
				i++;
			
			}while(i <= n);

		}else{
			
			i = n;
			
			do{
			
				System.out.print(i + ",");
				i++;
			
			}while(i <= m);
			
		}
	}

}
