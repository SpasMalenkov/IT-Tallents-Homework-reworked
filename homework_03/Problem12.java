package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [7];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
			
		}
		
		int b = 0;
		
		b = array[0];
		array[0] = array[1];
		array[1] = b;
		
		
		
		int c = array[2] + array[3];
		array[2] = c - array[2];
		array[3] = c - array[3];
		
		int d = array[4]*array[5];
		array[4] = d / array[4];
		array[5] = d / array[5];
		
		System.out.println(Arrays.toString(array));
		
	}

}
