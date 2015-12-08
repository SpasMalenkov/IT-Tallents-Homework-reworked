package homework_03;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter array size bigger than 3:");
		int size = sc.nextInt();

		while (size < 3) {
			
			System.out.println("The array size must be bigger than 3: ");
			size = sc.nextInt();
			
		}

		double[] array = new double[size];
		double[] maxNumbers = new double[3];

		for (int i = 0; i < array.length; i++) {
			
			array[i] = sc.nextDouble();
			
		}

		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < 0) {
				
				array[i] = array[i] * -1;
				
			}
		}
		
		double temp = 0;
		
		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					
				}
			}
		}

		int count = 2;
		int countNewArray = 1;
		
		double maxValue = array[array.length - 1];
		
		maxNumbers[0] = maxValue;
		
		for (int i = array.length - 1; i >= 0; i--) {
			
			if (array[i] != maxValue) {
				
				maxValue = array[i];
				maxNumbers[countNewArray] = maxValue;
				countNewArray++;
				count--;
				
				if (count == 0) {
					
					break;
					
				}
			}
		}

		for (int i = maxNumbers.length - 1; i >= 0; i--) {
			
			if (i == 0) {
				
				System.out.print(maxNumbers[i]);
				break;
				
			}
			
			System.out.print(maxNumbers[i] + "; ");
			
		}
		
	}
}
