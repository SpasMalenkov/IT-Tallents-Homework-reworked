package homework_02;

import java.util.Scanner;

public class Problem21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the color of the card: ");
		int color = sc.nextInt();
		System.out.print("Enter the power of the card: ");
		int power = sc.nextInt();
		
		for(int i = power; i < 14; i++){
			
			for(int j = color; j < 5; j++){
				
				switch(i){
					case 1:
						System.out.print("2 ");
						break;
					case 2:
						System.out.print("3 ");
						break;
					case 3:
						System.out.print("4 ");
						break;
					case 4:
						System.out.print("5 ");
						break;
					case 5:
						System.out.print("6 ");
						break;
					case 6:
						System.out.print("7 ");
						break;
					case 7:
						System.out.print("8 ");
						break;
					case 8:
						System.out.print("9 ");
						break;
					case 9:
						System.out.print("10 ");
						break;
					case 10:
						System.out.print("J ");
						break;
					case 11:
						System.out.print("Q ");
						break;
					case 12:
						System.out.print("K ");
						break;
					case 13:
						System.out.print("A ");
						break;
				}
			
				switch(j){
					case 1:
						System.out.println("Clubs ");
						break;
					case 2:
						System.out.println("Diamonds ");
						break;
					case 3:
						System.out.println("Hearts ");
						break;
					case 4:
						System.out.println("Spades ");
						break;
				}
			}
			
			color = 1;
			
		}
	}
}
