package homework_04;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = new int[6][6];
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
				
				System.out.print("array[" + i + "][" + j + "] = ");
				array[i][j] = sc.nextInt();
				
			}
		}
		
		int sumRow2 = 0;
		int sumRow4 = 0;
		int sumRow6 = 0;
		
		for(int i = 1; i < array.length; i+=2){
			
			for(int j = 0; j < array[i].length; j+=2){
				
				if(i / 2 == 0 ){
					
					sumRow2 = sumRow2 + array[i][j];
					
				}
				
				if(i / 2 == 1){
					
					sumRow4 = sumRow4 + array[i][j];
					
				}
				
				if(i / 2 == 2){
					
					sumRow6 = sumRow6 + array[i][j];
					
				}
			}
		}
		
		for(int i = 1; i < array.length; i+=2){
			
			for(int j = 0; j < array[i].length; j++){
				
				if(i / 2 == 0){
					
					System.out.print(array[i][j] + " ");
					
					if(j == array[i].length - 1){
						
						System.out.print("The sum of the row is: " + sumRow2);
					
					}
				}
				
				if(i / 2 == 1){
					
					System.out.print(array[i][j] + " ");
					
					if(j == array[i].length - 1){
						
						System.out.print("The sum of the row is: " + sumRow4);
					
					}
				}
				
				if(i / 2 == 2){
					
					System.out.print(array[i][j] + " ");
					
					if(j == array[i].length - 1){
						
						System.out.print("The sum of the row is: " + sumRow6);
					
					}
				}
				
				
			}
			
			System.out.println();
		}
		
		System.out.println("The sum of the rows is: " + (sumRow2 + sumRow4 + sumRow6));
		
	}

}
