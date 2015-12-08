package homework_05;

import java.util.Scanner;

public class Problem9_Unfinished {

	public static void main(String[] args) {
		
		//tuk dosta mi pomognaha kolegite za tova zadachata prilicha na tqhnata,
		//shte bude po-chesno ako ne polucha tochki za neq
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string with different symbols:");
		String str1 = sc.nextLine();
		int sum = 0;
		String bufferString = "";
		
		for (int i = 0; i < str1.length(); i++) {
			
			boolean isNumber = (str1.charAt(i) >= (char) 48) && (str1.charAt(i) <= (char) 57);
			
			if (!((str1.charAt(i) == '-') || isNumber)) {
				
				if (bufferString != "") {
					
					sum += Integer.parseInt(bufferString);
					
				}
				
				bufferString = "";
				
			} else {
				
				if ((str1.charAt(i) == '-') || isNumber) {
					
					if (str1.charAt(i) == '-') {
						
						if ((i > 0) && !(bufferString.isEmpty()) && Character.isDigit(str1.charAt(i - 1))) {
							
							sum += Integer.parseInt(bufferString);
							bufferString = "";
							
						}
						
						if ((i != str1.length() - 1) && (str1.charAt(i + 1) != '-') && Character.isDigit(str1.charAt(i + 1))) {
							
							bufferString += "-";
						
						}
					} else {
						
						if (str1.charAt(i) != '-') {
							
							bufferString += str1.charAt(i);
							
						}
					}

				} else {
					
					if (!bufferString.isEmpty()) {
						
						sum += Integer.parseInt(bufferString);
						
					}
				}
			}
		}
		
		if (!bufferString.isEmpty()) {
			
			sum += Integer.parseInt(bufferString);
			
		}
		
		System.out.println("Sum = " + sum);
		
	}

}
