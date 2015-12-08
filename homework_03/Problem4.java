package homework_03;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter a number: ");
		int n = sc.nextInt();
		
		int[] mass = new int[n];
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Enter a value for mass[" + i + "] = ");
			mass[i] = sc.nextInt();
		
		}
		
		boolean symmetric = true;
		
		for (int i = 0; i < (mass.length + 1) / 2; i++) {
		
			if (mass[i] != mass[n - i - 1])
		
				symmetric = false;
		
		}
		
		System.out.println("Symetric? " + symmetric);
			
		
	}

}
