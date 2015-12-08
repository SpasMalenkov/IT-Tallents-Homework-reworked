package homework_05;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		do{
			
			System.out.println("First string: ");
			str1 = sc.nextLine();
			
		}while(str1.length() > 40);
		
		do{
			
			System.out.println("Second string: ");
			str2 = sc.nextLine();
		
		}while(str2.length() > 40);
		
		System.out.println(str1.toUpperCase() + " " +  str1.toLowerCase() + " " + str2.toUpperCase() + " " + str2.toLowerCase());
		
	}

}
