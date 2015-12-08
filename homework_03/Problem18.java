package homework_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			
			System.out.print("Enter array length: ");
			n = sc.nextInt();
			
		}while(n < 0);
		
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		int[] array3 = new int[n];
		
		for(int i = 0; i < array1.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array1[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < array2.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array2[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < n; i++){
			
			if(array1[i] > array2[i]){
				
				array3[i] = array1[i];
				
			}
			else{
				
				array3[i] = array2[i];
				
			}
			
		}
		
		System.out.println("array 1: " + Arrays.toString(array1));

		System.out.println("array 2: " + Arrays.toString(array2));
		
		System.out.println("array 3: " + Arrays.toString(array3));
		
	}

}
