package homework_03;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int [7];
		
		for(int i = 0; i < array.length; i++){
			
			System.out.print("array[" + i + "] = ");
			array[i] = sc.nextInt();
			
		}
		
		int sum = 0;
		int middle = 0;
		
		for(int i = 0; i < array.length; i++){
			
			sum  = sum + array[i];
			
		}
		
		middle = sum / 7;
		
		System.out.println(sum + ", " + middle);
		
		
		double[] distance = new double[array.length];
		
		for(int i = 0; i< distance.length; i++) {
			
			double sub = array[i] - middle;
			double absSub = sub < 0 ? 0-sub : sub;
			distance[i] = absSub;
			
		}
		
		double minDistance = distance[0];
		
		int found = 0;
		
		for(int i = 1; i < distance.length; i++) {
			
			if(minDistance > distance[i]) {
				
				minDistance = distance[i];
				found = i;
			
			}
		}

		System.out.println("array[" + found + "] = " + array[found] + " is the closest element.");
		
	}

}
