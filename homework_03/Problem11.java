package homework_03;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [7];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
			
		}
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] % 5 == 0 && array[i] > 5){
				
				count++;
				System.out.print(array[i] + " ");
				
			}
			
		}
		
		System.out.println();
		
		System.out.print("There are " + count + " numbers.");
		
	}

}
