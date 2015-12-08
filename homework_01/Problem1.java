package homework_01;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number A:");
		float a = sc.nextFloat();

		System.out.println("Enter a number B:");
		float b = sc.nextFloat();

		System.out.println("Enter a number C:");
		float c = sc.nextFloat();

		if (a > c && b < c) {
			System.out.println("The number Ñ is between B and A.");
		} else if (a < c && b > c) {
			System.out.println("The number Ñ is between A and B!");
		} else {
			System.out.println("The number Ñ isn't between À and Â!");
		}

	}

}
