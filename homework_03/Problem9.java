package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {

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
		
		
		int b = 0;
		
		for(int i = 0; i < array.length / 2; i++){
			
			b = array[i];
			array[i] = array[n-1-i];
			array[n-1-i] = b;
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
