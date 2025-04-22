package ex03_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex04_Map {

	public static void main(String[] args) {
		// 학생별 국어, 영어, 수학 점수 저장 및 평균 계산
		// 학생 이름을 입력 받고, 해당 학생의 국어, 영어, 수학 점수를 입력 받는다.
		// 3명의 학생 정보를 받은 후, 각 학생의 평균 점수를 계산하여 출력하기
		
		// 학생 이름 : 홍길동
//		국어 점수 : 90
//		영어 점수 : 85
//		수학 점수 : 88
//		
//		학생 이름 : 김영희
//		국어 점수 : 100
//		영어 점수 : 95
//		수학 점수 : 90
		
		
		Scanner sc = new Scanner(System.in);
		Map<String, List<Integer>> studentMap = new HashMap<>();
		
		
		System.out.print("학생 이름 :");
		String name = sc.nextLine();
		
		System.out.print("국어 점수 :");
		int kor = sc.nextInt();
		
		
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();
		
		
		System.out.print("수학 점수 :");
		int math = sc.nextInt();
		
		
		List<Integer> scores = Arrays.asList(kor, eng, math);
		studentMap.put(name, scores);
		

		// 평균 구하기
		// keySet() -> HashMap 에 들어 있어 있는 모든 key를 set 으로 만들어서 반환
		
		
	}

}
