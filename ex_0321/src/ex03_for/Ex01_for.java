package ex03_for;
import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		// 반복문
		// 특정 명령을 원하는 만큼 반복하여 실행하는 아이콘
		// for, while
		
		// for : 주로 반복 횟수가 정해져 있을 때 사용하는 문법
		
		// 		for(초기식;조건식;증감식) {
		//			반복하고자 하는 명령
		// 		}
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화 한다.
		// 조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용한다.
		// 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할
		
		// 방식1
		for(int i = 0;i <= 3;i++) {
			System.out.println(i);
		}
		
		// 방식2 : 초기값을 밖에 쓸 수 있음
//		int i = 0;
//		for (;i <= 3; i++) {
//			System.out.println(i);
//		}
		
		// 방식3 : 증감식도 밖에다가 쓸 수 있음
//		for (;i <= 3;) {
//			System.out.println(i);
//			i++; 
//		}
		
		
		// 초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다.
		// 사용하는 게 좋을 것 같을 때 쓰면 된다.
		
		
		
		// 1부터 10까지 가로로 출력하는 for문 작성하기
		for (int i = 1;i <= 10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 10부터 1까지 가로로 출력하는 for문 작성하기 (거꾸로)
		// 방식1
		for (int i = 10;i >= 1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 방식2
		for (int i = 1;i <= 10; i++) {
			System.out.print((10-i)+" ");
		}
		
		
		System.out.println();
		
		
		// 1부터 10까지 3의 배수만 출력하는 for문 작성하기
		for (int i = 1;i <= 10; i++) {
			if(i % 3 == 0)
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		
		// 1부터 10 까지 총합구하기
		int sum = 0; // 총합을 담을 변수
		for (int i = 1;i <= 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10 까지의 총합 : " + sum);
		
		
		
		// 키보드에서 정수를 하나 입력 받아 햐당 단의 구구단 출력하기
		// 2 X 1 = 2
		// 2 X 2 = 3
		// 2 x 3 = 6 ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = sc.nextInt(); 
		
		for(int i = 1;i <= 10; i++ ) {
			System.out.printf("%d X %d = %d\n",dan,i,dan);
		}
		
		
		// 키보드에서 정수 n을 입력 받고
		// 1부터 정수 n까지의 총합을 계산하여 결과 출력하기
		
		Scanner scn = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int jungsu = scn.nextInt(); 
		int total = 0; // 총합을 담을 변수
		
		for (int i = 1;i <= jungsu; i++) {
			total += i;
		}
		System.out.printf("1부터 %d 까지의 총합 : %d", jungsu,total);
		
		
		System.out.println();
		
	
		
		// 10개의 정수를 입력 받아 그 중 짝수의 개수가 몇 개인지 구하기
		Scanner scn2 = new Scanner(System.in);
		
		int count = 0; // 짝수의 개수를 세어줄 변수
		
		for (int i = 1;i <= 10; i++) {
			System.out.printf("정수%d를 입력하세요 : ", i);
			int num = scn2.nextInt();
			if (num % 2 == 0) {
				count++; 
			}
		}
		System.out.printf("입력 받은 짝수의 개수 :  %d개", count);
		
		
		System.out.println();
		
		
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+...+10)
		// 의 결과를 계산하시오
		int sum2 = 0;
		int totalSum = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			totalSum += sum2;
			System.out.println(totalSum);
			
		}
		
		
		
		// 양의 정수 x를 키보드에서 입력받아
		// x가 홀수면 x이하의 홀수인 정수의 합을 구하고
		// x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하세요
		// x가 7이라면 1+3+5+7 = 16
		// x가 10이면 2X2 + 4X4 + 6X6 + 8X8 + 10x10 = 220
		Scanner scn3 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = scn3.nextInt();
		
		
		if (x % 2 == 0) {
			for (int i = 1;i <= x;i++) {
				int notOdd = 0;
				notOdd += i*i;
				System.out.println(" 짝수인 정수의 제곱의 합 : " + notOdd);
			}
		} else {
			for(int i = 1; i <= x; i++) {
				int odd = 0;
				odd += i;
				System.out.println( "홀수인 정수의 합" + odd);
			}
		} 
	
		
		
	}

}
