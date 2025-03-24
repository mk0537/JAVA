package Test;

import java.util.Scanner;

public class dayTest {

	public static void main(String[] args) {
// 문제 풀어보기 
		
//		1. 다음의 결과값을 예상하여 쓰시오
//		int x = 5;
//		int y = x++;

//		System.out.println("x의 값 : " +x); // x : ?
//		System.out.println("y의 값 : " +y); // y : ?
		
		int x1 = 5; 
		int y1 = x1++; // x1 : 6, y1 : 5
		System.out.println("x1 : " + x1 + ", y1 : " + y1);

		
		
//		2. 다음 연산의 결과를 예상하여 쓰시오
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);

		int x2 = 10;
		int y2 = 20;
		int z = (++x2) + (y2--); // x2 : 11, y2 : 19, z: (11+20)31
		System.out.println("x2 : " + x2 + ", y2 : " + y2 + ", z : " + z);
		
		
		
//		3. 다음 연산의 결과를 예상하여 쓰시오
		int a = 10;
		int b = 12;
//		++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
//		답 : 0		                                                                
		
		System.out.println(++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10);
		// true
		
		  
//		4. 국어,영어,수학에 대한 점수를 키보드를 이용해 정수로 입력받고
//		1. 세 과목에 대한 합계 출력하기
//		2. 평균 출력하기 (합계/3.0)

//		Scanner scn = new Scanner(System.in);
//		
//		System.out.print("국어 점수 입력 :");
//		int kor = scn.nextInt();
//		System.out.print("영어 점수 입력 :");
//		int eng = scn.nextInt();
//		System.out.print("수학 점수 입력 :");
//		int math = scn.nextInt();
//		
//		int total = kor + eng + math;
//		float avg = (float)total / 3;  // 강제 형변환
//		
//		System.out.printf("총점 : %d, ",total);
//		System.out.printf("평균 : %.1f",avg);
//		System.out.println();
		
		
//		5. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격
//		아니면 불합격
		
//		if (kor <= 40 || eng <= 40 || math <= 40 || avg <= 60) {
//			System.out.println("불합격입니다.");
//		} else {
//			System.out.println("합격입니다.");
//		}
		
		// ---------------------------------------------------
		
		// 상자 하나에는 농구공이 5개 들어갈 수 있다.
		// X개의 농구공을 담기 위한 박스의 개수를 구하세요.
		// 농구공의 개수는 키보드를 통해 입력 받습니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("농구공의 개수 입력 :");
//		int ball = sc.nextInt();
//	
//		int box = ball % 5; // 농구공을 5개씩 담은 후 나머지
//		
//		
//		if (box == 0) { 
//			int box1 = ball/5;
//			System.out.printf("필요한 박스 %d개", box1);
//		} else {
//			System.out.printf("공이 %d개 남습니다.", box);
//		}
		
		
		
		// 과수원이 있다. 배, 사과, 오렌지를 키우고 있는데 
		// 하루에 생산되는 양은 각각 5, 7, 5개 이다.
		// 과수원에서 하루에 생산되는 총 개수를 출력하고
		// 시간당 전체 과일의 생산 개수를 출력하시오. 개수/24
		// 평균값을 담는 변수는 float으로 계산할 것.
		
		int bae = 5;
		int apple = 7;
		int orenge = 5;
		
		int totalFruits = bae + apple + orenge;
		float avgFruits = (float)totalFruits/24; // 강제형변환
		
		System.out.println("과일의 총 개수 : " + totalFruits);
		System.out.println("시간당 전체 과일의 평균 생산 개수 : " + avgFruits);
		
		
	}

}
