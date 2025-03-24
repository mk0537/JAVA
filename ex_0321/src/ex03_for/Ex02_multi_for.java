package ex03_for;

public class Ex02_multi_for {

	public static void main(String[] args) {
		// 이중 for문 : for문 안에 또 반복하고 싶은 반복문을 반복하는 문법
		
		// for (초기식;조건식;증감식){
		//		for(초기식;조건식;증감식){
		//			반복하고 싶은 명령
		//	   	  }
		// 	 }
		
		
		
		// A B C D
		// E F G H
		// I J K H
	
		char alpha = 'A';
		for(int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(alpha + " "); // 출력 후
				alpha++; // 값 증가
			} System.out.println(); // 줄바꿈
		} 
		
		
		System.out.println();
		// ------------------------------------------------
		
		
		// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 
		// 모든 경우의 수를 출력하는 프로그램을 작성하시오
		// 1,5
		// 2,4
		// 3,3
		// 4,2
		// 5,1
		
		int su1 = 1;
		int su2 = 5;
		for (int i = 1;i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				if(i+j == 6) {
					System.out.println("("+ su1 + "," + su2+ ")");
					su1++;
					su2--;
				}
			}
		}
		
		
		
		
		
		

	}

}
