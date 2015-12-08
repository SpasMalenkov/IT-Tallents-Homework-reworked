package homework_04;

public class Problem1 {

	public static void main(String[] args) {
		
		int[][] array = {
				{11,12,13,14,15},
				{29,28,77,26,25},
				{31,32,33,34,35},
				{49,48,47,46,45},
				{51,52,53,54,05},
				{69,67,68,66,65},
		};
		
		int maxElement = array[0][0];
		int minElement = array[0][0];
		
		for(int i = 0; i < array.length; i++){
			
			for(int j = 0; j < array[i].length; j++){
				
				if(maxElement < array[i][j]){
					
					maxElement = array[i][j];
					
				}
				if(minElement > array[i][j]){
					
					minElement = array[i][j];
					
				}
			}
		}
		
		System.out.println("The min element is: " + minElement);
		
		System.out.println("The max element is: " + maxElement);
	}

}
