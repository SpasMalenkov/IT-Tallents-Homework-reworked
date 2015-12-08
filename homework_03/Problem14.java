package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			
			System.out.print("Enter array length: ");
			n = sc.nextInt();
			
		}while(n <= 0);
		
		double[] array = new double [n];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextDouble();
			
		}
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] > -3.00 && array[i] < 3.00){
				
				count++;
				
			}
		}
		
		double[] newArray = new double[count];
		
		int j = 0;
		
		for(int i = 0; i < array.length; i++){
					
			if(array[i] < 3.00 && array[i] > -3.00){
						
				newArray[j] = array[i];
				j++;
						
			}
		}
		
		
		for(int i = 0; i < newArray.length; i++){
			
			System.out.print(newArray[i] + " ");
			
		}
		System.out.println();
		System.out.print(newArray.length);
	}

}
