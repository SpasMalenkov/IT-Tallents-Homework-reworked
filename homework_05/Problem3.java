package homework_05;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First string: ");
		String str1 = sc.next();
		
		System.out.println("Second string: ");
		String str2 = sc.next();
		
		int length = 0;
		
		if(str1.length() == str2.length()){
			
			System.out.println("The two string have equal length.");
			length = str1.length();
			
			System.out.println("The diference is in position: ");
			
			for(int i = 0; i < length; i++){
				
				if(str1.charAt(i) != str2.charAt(i)){
					
					System.out.println(i + " " + str1.charAt(i) + " - " + str2.charAt(i));
					
				}
				
			}
		}
		
		if(str1.length() > str2.length()){
			
			System.out.println("str1 have bigger length than str2.");
			
			System.out.println("The diference is in position: ");
			for(int i = 0; i < str2.length(); i++){
				
				if(str1.charAt(i) != str2.charAt(i)){
					
					System.out.println(i + " " + str1.charAt(i) + " - " + str2.charAt(i));
					
				}
				
			}
		}
		
		if(str1.length() < str2.length()){
			
			System.out.println("str2 have bigger length than str1.");
			
			System.out.println("The diference is in position: ");
			for(int i = 0; i < str1.length(); i++){
				
				if(str1.charAt(i) != str2.charAt(i)){
					
					System.out.println(i + " " + str1.charAt(i) + " - " + str2.charAt(i));
					
				}
				
			}
		}
		
	}

}
