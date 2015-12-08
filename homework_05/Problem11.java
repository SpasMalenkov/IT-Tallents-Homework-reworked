package homework_05;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array legth: ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
			
		}
		
		printArray(array);
		
	}

	static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i] + " ");
			
		}
	}

}
