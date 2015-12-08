package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int d = a;
		int count = 0;
		
		while(d > 0){
			
			d/=2;
			count++;
			
		}
		
		d = a;
		int[] array = new int[count];
		
		for(int i = count - 1; i >= 0; i--){
			
			array[i] = a % 2;
			a/=2;
			
		}
		
		for(int i = 0; i < count; i++){
			
			System.out.print(array[i]);
			
		}
		
	}

}
