package homework_05;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array legth: ");
		int n = sc.nextInt();
		
		printAndCreateArray(n);
		
	}

	static void printAndCreateArray(int n) {
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			
			array[i] = i + 1;
			System.out.print(array[i] + " ");
			
		}
		
	}

}
