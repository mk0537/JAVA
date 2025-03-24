package ex04_while;
import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		// while 문과 같이 조건을 만족할 때까지 반복한다
		// 다만, while 문과 다른 점은 먼저 루프를 무조건 한 번 실행한 후
		// 조건식을 검사한다는 점이다.
		// 즉, 조건식의 결과와 상관없이 무조건 한 번은 실행한다.
		
		// do {
		//	반복하고자 하는 명령
		// } while (조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		} while(i <= 10); // false, 한번만 실행
		
		
		// 1 ~ 10 까지의 총합 구하기
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while (num <= 10);
		
		System.out.println("1~10 총합 : " +sum);
		
		
		
		// 비밀번호 확인 프로그램 만들기
		// 사용자로부터 비밀번호를 입력 받아 올바른 비밀번호가 입력될 때까지
		// 계속 입력을 요구하는 프로그램 만들기
		// 비밀번호는 9486
		
//		int secret = 9486;
//		int number = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//			System.out.print("비밀번호를 입력하세요 : ");
//			number = sc.nextInt();
//			if (secret != number) {
//				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요");
//			}
//		} while ( secret != number );
//		
//		System.out.println("접속 성공!");
		
		
		// 학생의 국어, 영어, 수학 점수를 입력 받는다.
		// 다느 각 과목은 40점 이상이어야 하며
		// 40점 미만이면 해당 과목 점수를 다시 입력 받아야 한다.
		Scanner scn = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		do {
			System.out.print("국어 점수 입력 : ");
			kor = scn.nextInt();
			System.out.print("영어 점수 입력 : ");
			eng = scn.nextInt();
			System.out.print("수학 점수 입력 : ");
			math = scn.nextInt();
			
			if(kor >= 40 && eng >= 40 && math >= 40) {
				System.out.println("합격입니다!");
			} else {
				System.out.println("다시 입력하세요.");
			}
			} while (kor < 40 || eng < 40 || math < 40);
			
		
		
		
		
		
		
		
	}

}
