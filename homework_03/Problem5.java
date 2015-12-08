package homework_03;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		int[] mass = new int[10];
		
		for(int i = 0; i < mass.length; i++){
			
			mass[i] = i*3;
			
		}
		
		System.out.println(Arrays.toString(mass));
		
	}

}
