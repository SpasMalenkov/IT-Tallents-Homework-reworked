package homework_05;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = {10, 3, 9, -3, -6, 21, 13, -2};
		int[] array2 = {23, 13, 9, -30, -16, 1, 3, -22};
		
		printArray(createNewArray(array1, array2));
		
	}

	static int[] createNewArray(int[] array1, int[] array2) {
		
		int length = array1.length + array2.length;
		
		int[] newArray = new int[length];
		
		for(int i = 0; i < array1.length; i++){
			
			newArray[i] = array1[i];
			
		}
		
		int j = 0;
		for(int i = array1.length; i < length; i++){
			
			newArray[i] = array2[j];
			j++;
			
		}
		
		return newArray;
	}
	
	static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i] + " ");
			
		}
	}

}
