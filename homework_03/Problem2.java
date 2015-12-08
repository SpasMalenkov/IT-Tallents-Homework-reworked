package homework_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int length = sc.nextInt();
		
		int[] mass = new int[length];
		
		for(int i = 0; i < mass.length; i++) {
			
			System.out.print("mass[" + i + "] = ");
			mass[i] = sc.nextInt();
		
		}
		int[] mass2 = new int[length];
		
		for(int i = 0; i < length / 2; i++){
			
			mass2[i] = mass[i];
			
		}
		
		int newLength = length / 2;
		
		for (int i = length - 1; i >= length / 2; i--)
		{
			
			mass2[newLength] = mass[i];
			newLength++;
			
		}
		
		System.out.print(Arrays.toString(mass2));
	}

}
