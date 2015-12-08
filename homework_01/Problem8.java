package homework_01;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int digit = 0;
		int newNumber1 = 0;
		int newNumber2 = 0;
		
		if(a > 0){
			if(a > 999 && a < 10000){
				digit = a % 10;
				newNumber1 += digit;
				a /= 10;
			}
			if(a > 99 && a < 1000){
				digit = a % 10;
				newNumber2 += digit;
				a /= 10;
			}
			if(a > 9 && a < 100){
				digit = a % 10;
				digit *= 10;
				newNumber2 += digit;
				a /= 10;
			}
			if(a > 0 && a < 10){
				digit = a % 10;
				digit *= 10;
				newNumber1 += digit;
				a /= 10;
			}
		}
		if(newNumber1 > newNumber2){
			System.out.println(newNumber1 + ">" + newNumber2);
		}
		if(newNumber1 < newNumber2){
			System.out.println(newNumber1 + "<" + newNumber2);
		}
		if(newNumber1 == newNumber2){
			System.out.println(newNumber1 + "=" + newNumber2);
		}
	}

}
