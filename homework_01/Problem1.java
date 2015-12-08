package homework_01;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете число A:");
		float a = sc.nextFloat();

		System.out.println("Въведете число B:");
		float b = sc.nextFloat();

		System.out.println("Въведете число C:");
		float c = sc.nextFloat();

		if (a > c && b < c) {
			System.out.println("Числото С е между А и В.");
		} else if (a < c && b > c) {
			System.out.println("Числото С е между В и А!");
		} else {
			System.out.println("Числото С не е в интервала между А и В!");
		}

	}

}
