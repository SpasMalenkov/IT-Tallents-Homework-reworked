package homework_01;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� ����� A:");
		float a = sc.nextFloat();

		System.out.println("�������� ����� B:");
		float b = sc.nextFloat();

		System.out.println("�������� ����� C:");
		float c = sc.nextFloat();

		if (a > c && b < c) {
			System.out.println("������� � � ����� � � �.");
		} else if (a < c && b > c) {
			System.out.println("������� � � ����� � � �!");
		} else {
			System.out.println("������� � �� � � ��������� ����� � � �!");
		}

	}

}
