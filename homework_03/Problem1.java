package homework_03;

public class Problem1 {

	public static void main(String[] args) {
		
		int[] mass = {10, 3, 9, -3, -6, 21, 13, -2};
		
		int a = 0;
		
		for(int i = 0; i < mass.length; i++){
			
			if(mass[i] % 3 == 0){
				
				if(a > mass [i]){
					
					a = mass[i];
					
				}
			}
			
		}
		
		System.out.print(a);
		
	}

}
