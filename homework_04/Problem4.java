package homework_04;

public class Problem4 {

	public static void main(String[] args) {
		
		int[][] array = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		for(int row = 0; row < array.length; row++){
		
			for(int col = array[row].length - 1; col >= 0; col--){
			
				System.out.print(array[col][row] + " ");
			
			}
			
			System.out.println();
			
		}
		
	}

}
