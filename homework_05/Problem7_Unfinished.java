package homework_05;

import java.util.Scanner;

public class Problem7_Unfinished {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		int length = str1.length();
		
		int wordCount = 1;
		
		for(int i = 0; i < str1.length(); i++){
			
			if(str1.charAt(i) == ' '){
				
				wordCount++;
				
			}
		}
		
		
		int charCount = 0;
		int charCountedBefore = 0;
		int i = 0;
		
		while(i < str1.length()){
			
			charCount++;
			
			if(str1.charAt(i) == ' '){
				
				if(charCountedBefore < charCount){
					
					charCountedBefore = charCount;
					i++;
					
				}
				
				charCount = 0;
				
			}
			
			if(i == length){
				
				if(charCountedBefore < charCount){
					
					charCountedBefore = charCount;
					break;
					
				}
				
			}
			
			i++;
			
		}
		
		System.out.println(wordCount + " words, the longest is " + charCountedBefore + " symbols.");
		
	}

}
