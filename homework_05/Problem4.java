package homework_05;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = str1.replaceAll(" " , "");
		 
		int count = 0;
		int count2 = 0;
		
		//tuk broq po kolko elementa se padat v masiv za imenata,
		//kato sum premahnal predi tova
		//vsqko prazno mqsto(space) i ne broq zapetaqta
		for(int i = 0; i < str2.length(); i++){
			
			if(str2.charAt(i) != ','){
				
				count++;
				
			}
			else{
				
				break;
				
			}
			
		}
		
		for(int i = count + 1; i < str2.length(); i++){
			
				count2++;
				
		}
		
		//suzdavam dva masiva za da moga da izchislq 
		//sumata na ASCII kodovete na sustavqsthite bukvi
		int[] array1 = new int[count];
		int[] array2 = new int[count2];
		int j = count + 1;
		int sumAsciiArray1 = 0;
		int sumAsciiArray2 = 0;
		
		//tuk subiram stoinostite na bukvite v ASCII kod
		for(int i = 0; i < count; i++){
			
			array1[i] = str2.charAt(i);
			sumAsciiArray1 += array1[i];
			
		}
		
		for(int i = 0; i < count2; i++){
			
			array2[i] = str2.charAt(j);
			j++;
			sumAsciiArray2 += array2[i];
			
		}
		
		//tuk razdelqm stringa na dve i izvejdam po-golqmata suma po ASCII kod
		String[] parts = str1.split(", ");
		String part1 = parts[0];
		String part2 = parts[1];
		
		if(sumAsciiArray1 > sumAsciiArray2){
			
			System.out.println(part1);
			
		}else{
			
			System.out.println(part2);
			
		}
		
	}
}
