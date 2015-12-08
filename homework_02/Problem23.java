package homework_02;

public class Problem23 {

	public static void main(String[] args) {
		
		
		int i = 1;
		int j = 1;
		
		while(i < 10){
			
			while(j < 10){
				
				if(j >= i){
					
					System.out.print(i + "*" + j + "; ");
					
				}
				
				j++;
				
			}
			
			j = 1;
			i++;
			
			System.out.println();
		}
	}

}
