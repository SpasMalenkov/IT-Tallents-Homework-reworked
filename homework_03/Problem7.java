package homework_03;

import java.util.Scanner;

import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			
			System.out.println("Enter length of the first array: ");
			n = sc.nextInt();
		
		}while(n < 0);
		
		int[] array = new int [n];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
			
		}
		
		int[] newArray = new int [n];
		
		newArray[0] = array[0];
		newArray[n - 1] = array[n - 1];
		
		for(int i = 1; i < array.length - 1; i++){
			
			newArray[i] = array[i-1] + array[i+1];
			
		}
		
		System.out.print(Arrays.toString(newArray));
		
	}

}
