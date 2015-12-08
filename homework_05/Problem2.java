package homework_05;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		//vuvejdame string ot dve dumi
		String str1;
		
		do{
			
			System.out.println("Enter a string with two words: ");
			str1 = sc.nextLine();
			
		}while(str1.length() > 20 && str1.length() < 10);
		
		//razdelqme dvete dumi v dva otdelni stringa
		String[] parts = str1.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		
		// suzdavame nov string sus StringBuilder
		StringBuilder newString = new StringBuilder();
		
		int length = 0;
		
		
		//sravnqvame tqhnata duljina i zapulvame novia string 
		//sprqmo sravnenieto na dvata stringa i printirame novia string
		if(part1.length() > part2.length()){
			
			length = part1.length();
			
			for(int i = 0; i < 5; i++){
				
				newString.insert(i, part2.charAt(i));
				
			}
			for(int i = 5; i < length; i++){
				
				newString.insert(i, part1.charAt(i));
				
			}
			
		}
		
		if(part1.length() < part2.length()){
			
			length = part2.length();
			
			for(int i = 0; i < 5; i++){
				
				newString.insert(i, part1.charAt(i));
				
			}
			for(int i = 5; i < length; i++){
				
				newString.insert(i, part2.charAt(i));
				
			}
			
		}
		
		System.out.println(length + " " + newString);
		
	}

}
