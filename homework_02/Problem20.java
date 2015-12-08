package homework_02;

public class Problem20 {

	public static void main(String[] args) {
		
		//na tuk ne uspqh da premana poqvqvaneto na poslednata nula... inache kvadrata se poqvqva... pochti...
		int row;
		int col;
		
		int sum = 0;
		int sum2 = 0;
		
		for(row = 0; row < 10; row++){
			
			sum = sum + row;
			
			if(row == 9){
				
				row = -1;
			
			}
			
			for(col = row + 1; col < 10; col++){
				
				
				System.out.print(col + " ");
				sum2 = sum2 + col;
				
				
				
				if(col == 9){
					
					col = 0;
					System.out.print(col + " ");
					
				}
				
				if(sum2 == 45){
					
					sum2 = 0;
					break;
					
				}
				
			}
			
			
			if(sum == 45){
				
				break;
				
			}
			
			System.out.println();
			
		}

	}

}
