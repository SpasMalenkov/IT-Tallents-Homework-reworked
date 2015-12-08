package homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[4][4];
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
				
				System.out.print("array[" + i + "][" + j + "] = ");
				array[i][j] = sc.nextInt();
				
			}
		}
		
		int sumRow = 0;
		int sumCol = 0;
		int row = 0;
		int col = 0;
		
		for(int i = 0; i < array.length; i++){
			
			int sumOfRow = 0;
			
			for(int j = 0; j < array[0].length; j++){
				
				sumOfRow = sumOfRow + array[i][j];
				
			}
			
			if(sumRow < sumOfRow){
				
				sumRow = sumOfRow;
				row = i;
				
			}
			
		}
		
		for(int i = 0; i < array[0].length; i++){
			
			int sumOfCol = 0;
			
			for(int j = 0; j < array.length; j++){
				
				sumOfCol = sumOfCol + array[j][i];
				
			}
			
			if(sumCol < sumOfCol){
				
				sumCol = sumOfCol;
				col = i;
				
			}
			
		}
		
		System.out.println("On row " + row + " is the max sum --> " + sumRow);
		System.out.println("On col " + col + " is the max sum --> " + sumCol);
		
		if(sumRow > sumCol){
			
			System.out.println(sumRow + " > " + sumCol);
			
		}
		if(sumRow < sumCol){
			
			System.out.println(sumRow + " < " + sumCol);
		
		}
		if(sumRow == sumCol){
			
			System.out.println(sumRow + " = " + sumCol);
		
		}
	}

}
