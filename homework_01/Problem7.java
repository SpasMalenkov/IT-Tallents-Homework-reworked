package homework_01;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���: ");
		int hour = sc.nextInt();
		
		if(hour>=1 && hour<=24){
			
			System.out.print("����� � " + hour);
		
		}else{
			
			System.out.println("������ �������� ���: ");
			hour=sc.nextInt();
		
		}
		
		System.out.print("������� ����: ");
		float money = sc.nextFloat();
		
		System.out.print("���� ��� �����? ");
		boolean amIGood = false;
		
		if(amIGood = sc.nextBoolean()){
					
			System.out.print("���� �� �������!");
					
			if(money >= 20){
					
				if(hour<7 || hour>=22){
							
					System.out.print(" �� �� ������ ��������� ������!");
						
				}else{
							
					System.out.print(" �� �� ���� ����������� �� ��������!");
						
				}
						
			}else{
						
				System.out.print(" �� �� ���� ����� � �� ��� ���!");
					
			}
				
		}else{
					
			System.out.print("����� ���!");
					
			if(money >=20){
						
				if(hour>21 && hour<=24){
							
					System.out.print(" �� ������ �� ���!");
						
				}else if(hour>=1 && hour<=7){
							
					System.out.print(" ����� � �� �������!");
						
				}else{
							
					System.out.print(" �� ������ �� ����!");
						
				}
					
			}else{
						
				System.out.print(" ���� ������ ��� ����?!");
						
			}
					
		}
	}

}
