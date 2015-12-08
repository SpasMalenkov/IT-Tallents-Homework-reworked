package homework_05;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1 = sc.nextLine();
		
		String newString = "";
		//v novia string purvia char go pravi glavna bukva vinagi
		newString += Character.toUpperCase(str1.charAt(0));
		
		//sled tova zavurtame cikul i za sledvashtite charove
		for(int i = 1; i < str1.length(); i++){
			
			//ako ne e prazno mqsto(space) dobavqme noviq char
			//kato vinagi go pravi malka bukva
			if(str1.charAt(i) != ' '){
				
				newString += Character.toLowerCase(str1.charAt(i));
				
			}
			
			//ako e prazno mqsto pravi sledvashtia element glavna bukva
			//dobavqme praznoto mqsto i preskachame na po sledvashtia element s i++
			if(str1.charAt(i) == ' ' && i < str1.length() - 1){
				
				if(str1.charAt(i + 1) != ' '){
					
					newString += " ";
					newString += Character.toUpperCase(str1.charAt(i + 1));
					
				}
				
				//reshih ako ima vuvedeni dve prazni mesta da break-na i da izveda suobshtenie
				//sled tova shte se izvede novia string do momenta, neznam dali taka e vqrno
				if(str1.charAt(i + 1) == ' '){
					
					System.out.println("Enter the string again!");
					break;
					
				}
				
				i++;
				
			}
			
		}
		
		
		System.out.printf(newString);
		
	}

}
