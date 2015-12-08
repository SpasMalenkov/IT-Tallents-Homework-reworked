package homework_05;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		
		boolean isPalindrome = true;
		
		int length = str1.length();
		
		for(int i = 0; i < length / 2; i++) {
			
			if(str1.charAt(i) != str1.charAt(length - i - 1)){
				
				isPalindrome = false;
				break;
				
			}
		}
		
		System.out.printf(str1 + " is palindrome: " + isPalindrome);
	}

}
