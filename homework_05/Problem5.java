package homework_05;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		char[] array = new char[str1.length()];
		char letter = str2.charAt(0);
		int letterFound = 0;
		
		for(int i = 0; i < str1.length(); i++){
			
			array[i] = str1.charAt(i);
			
		}
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] != letter){
				
				letterFound = -1;
				
				
			}
			else{
				
				letterFound = i;
				break;
				
			}
			
		}
		
		if(letterFound == -1){
			
			System.out.println("There is no match found.");
			
		}
		else{
			
			for(int i = 0; i < array.length; i++){
				
				System.out.print(array[i]);
				
				if(array[i] == letter){
					
					for(int j = 1; j < str2.length(); j++){
						
						System.out.print(str2.charAt(j));
						
					}
					
				}
				
				System.out.println();
				
			}
		}
	}
}
