package homework_04;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] array = {
				{11, 12, 13, 14, 15, 16},
				{21, 22, 23, 24, 25, 26},
				{31, 32, 33, 34, 35, 36},
				{41, 42, 43, 44, 45, 46},
				{51, 52, 53, 54, 55, 56},
				{61, 62, 63, 64, 65, 66}
		};
		
		//tuk sum slojil sluchaq s koito moje da se vuvejdat elementi ot konzolata
//		int[][] array = new int[6][6];
//		
//		for(int i = 0; i < array.length; i++){
//			
//			for(int j = 0; j < array[i].length; j++){
//				
//				System.out.print("array[" + i + "][" + j + "] = ");
//				array[i][j] = sc.nextInt();
//				
//			}
//			
//		}
		
		int sumRow = 0;
		int sumAllRows = 0;
		int row = 6;
		int col = 6;
		
		int r;
		int c;
		
		for(int i = 0; i < (row * col); i++){
			
			r = i / row;
			c = i % col;
			
			if((r + c) % 2 == 0){
				
				System.out.print(array[r][c] + " ");
				sumRow = sumRow + array[r][c];
				
			}
			
			if(c == col - 1){
				
				System.out.print("The sum of the elements of the row is: " + sumRow);
				sumAllRows = sumAllRows + sumRow;
				sumRow = 0;
				System.out.println();
				
			}
		}
		
		System.out.println("The whole sum of the elements is: " + sumAllRows);
		
	}

}
