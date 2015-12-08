package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			
			System.out.print("Enter array length: ");
			n = sc.nextInt();
			
		}while(n < 0);
		
		float[] array = new float [n];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextFloat();
			
		}
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i] + " ");
			
		}
		
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] < - 0.231){
				
				array[i] = (i + 1)*(i + 1) + 41.25f;
				
			}
			else{
				
				array[i] = (i + 1) * array[i];
				
			}
			
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i] + " ");
			
		}
		
		
		
	}

}
