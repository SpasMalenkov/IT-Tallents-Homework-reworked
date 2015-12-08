package homework_05;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();//vzemam celiq string zashtoto taka mi se struva po-zabaven rezultata :)
		
		for(int i = 0; i < str1.length(); i++){
			
			char newLetter = (char) (str1.charAt(i) + 5);
			
			System.out.print(newLetter);
			
		}
		
	}

}
