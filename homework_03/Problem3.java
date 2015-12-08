package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		int[] mass = new int [10];
		
		mass[0] = number;
		mass[1] = number;
		
		for(int i = 2; i < mass.length; i++){
			
			mass[i] = mass[i-1] + mass[i-2];
			
		}
		
		for(int i = 0; i < mass.length; i++){
			
			System.out.print(mass[i] + " ");
			
		}
		
	}

}
