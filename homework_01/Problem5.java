package homework_01;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number A:");
		int a = sc.nextInt();

		System.out.print("Enter a number B:");
		int b = sc.nextInt();
		
		System.out.print("Enter a number Ñ:");
		int c = sc.nextInt();
		
		if(a<b && b<c){
			System.out.println(c + "," + b + "," + a);			
		}else if(b<a && a<c){
			System.out.println(c + "," + a + "," + b);	
		}else if(b<c && c<a){
			System.out.println(a + "," + c + "," + b);
		}else if(c<b && b<a){
			System.out.println(a + "," + b + "," + c);
		}else if(c<a && a<b){
			System.out.println(b + "," + a + "," + c);
		}else{
			System.out.println(b + "," + c + "," + a);
		}

	}

}
