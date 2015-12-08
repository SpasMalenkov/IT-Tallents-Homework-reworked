package homework_03;

public class Problem17 {

	public static void main(String[] args) {
		
		int[] array = {1, 0, 1, -1, 2, 1};
		
		boolean increasing = false;
		boolean jagged = true;
		boolean jaggedUp = false;
		
		if (array[0] < array[1]) {
			
			increasing = true;
			jaggedUp = true;
			
		} else {
			
			increasing = false;
			jaggedUp = false;
			
		}
		
		for(int i=0; i < array.length - 1; ++i) {
			
			if (increasing) {
				
				if (array[i] >= array[i+1]) {
					
					jagged = false;
					break;
					
				} else {
					
					increasing = !increasing;
					
				}
			}
			else {
				
				if (array[i] <= array[i+1]) {
					
					jagged = false;
					break;
					
				} else {
					
					increasing = !increasing;
					
				}
			}
		}
		
		System.out.println("Jagged: " + jagged);
		System.out.println("Zigzag shaped up: " + jaggedUp);
		
	}

}
