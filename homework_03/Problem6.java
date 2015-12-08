package homework_03;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do{
			
			System.out.println("Enter length of the first array: ");
			n = sc.nextInt();
		
		}while(n < 0);
		
		int[] mass1 = new int[n];
		
		for(int i = 0; i < mass1.length; i++){
			
			System.out.print("mass[" + i + "] = ");
			mass1[i] = sc.nextInt();
			
		}
		
		int m;
		
		do{
			
			System.out.println("Enter length of the second array: ");
			m = sc.nextInt();
		
		}while(m < 0);
		
		int[] mass2 = new int[m];
		
		for(int i = 0; i < mass2.length; i++){
			
			System.out.print("mass[" + i + "] = ");
			mass2[i] = sc.nextInt();
			
		}

		boolean equal = mass1.length == mass2.length;
		boolean ravni = false;
		
		for(int i = 0; i < mass1.length && equal; i++){
			
			if(mass1.length != mass2.length){
				
				equal = false;
				
			}
		}
		
		for(int i = 0; i < mass1.length && equal; i++){
			
			if(mass1[i] != mass2[i]){
			
				ravni = false;
				break;
				
			}
			else{
				
				ravni = true;
				
			}
		}
		
		System.out.println("Elements equals? " + ravni);
		System.out.println("Length equals? " + equal);
		
	}

}
