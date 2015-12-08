package homework_01;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Въведете число A:");
		int a = sc.nextInt();

		System.out.print("Въведете число B:");
		int b = sc.nextInt();
		
		if(a<b){
			System.out.println(a + "," + b);
		}else{
			System.out.println(b + "," + a);
		}
		
	}
}
