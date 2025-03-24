package ex04_while;
import java.util.Random;
import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		// while 문은 반복횟수가 정해져 있을 때 할 수도 있지만
		// 반복횟수를 정확히 모를 때 유용하다
		
		
		// 초기식;
		
		// while(조건식) {
		//		반복하고자 하는 명령
		
		// 	증감식;
		// }
		
		
		int i = 1; // 초기식
		
		while(i < 4) {
			
			System.out.println(i);
			i++; // 증감식
		}
		
		System.out.println();
		
		// 반복 횟수가 정해져 있지 않을 때
		Random rnd = new Random();
		int random = rnd.nextInt(10)+1; // 1~10 사이의 난수
		Scanner sc = new Scanner(System.in);
		// 키보드에서 값을 입력 받는다.
		
		boolean isAnswer = true;
		while (isAnswer) {
			System.out.println("정답 : ");
			int answer = sc.nextInt();
			if (answer == random) {
				System.out.println("정답입니다!");
				isAnswer = false;
			}
		}
		
		System.out.println();
		
	
		// int 타입 변수 num 에 정수를 입력받고
		// 각 자리수의 합을 더한 결과를 출력하세요
		// 100 -> 1 + 0 + 0
		// 12345 -> 1 + 2 + 3 + 4 + 5
		Scanner sc2 = new Scanner(System.in);
		int num = sc2.nextInt();
		int sum = 0; // 합계를 담을 변수
		 
		while (num > 0 ) {
			sum += num %10;
			num = num / 10;
		}
		
		System.out.println(sum);
		
		
		
		
		

	}

}
