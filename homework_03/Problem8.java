package homework_03;

public class Problem8 {

	public static void main(String[] args) {
		
		int[] mass = {1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2};
		
		int l = 1;
		int s = 0;
		int bl = 0;
		int bs = 0;
		
		for(int i = 0; i < mass.length; i++){
			
			if(i == 0 || mass[i]!=mass[i-1]){
				
				l = 1;
				s = i;
			
			}else{
				
				l++;
				
				if(l>bl){
					
					bs=s;
					bl=l;
					
				}
			}
		}
		
		System.out.print("Result:");
		
		for(int i = bs; i < bs + bl; i++){
			
			System.out.print(" " + mass[i]);
			
		}
	}

}
