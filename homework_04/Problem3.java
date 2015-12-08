package homework_04;

public class Problem3 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15},
				{21,22,23,24,25},
				{31,32,33,34,35},
				{41,42,43,44,45},
				{51,52,53,54,55},
				{51,52,53,54,55}
		};
		
		int sum = 0;
		int middle = array.length * array[0].length;
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
				
				sum = sum + array[i][j];
				
			}
		}
		
		float average = (float)sum / middle;
		
		System.out.println(sum);
		System.out.println(average);
		
	}

}
