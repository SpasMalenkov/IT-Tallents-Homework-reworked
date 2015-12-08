package homework_04;

public class Problem2 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15},
				{21,22,23,24,25},
				{31,32,33,34,35},
				{41,42,43,44,45},
				{51,52,53,54,55},
		};
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print(array[i][i] + " ");
			
		}
		
		System.out.println();
		
		int i = 0;
		
		for(int j = array[i].length - 1; j >= 0; j--){
			
			System.out.print(array[i][j] + " ");
			i++;
			
		}
	}

}
