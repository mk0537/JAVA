package ex01_multi_array;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
			int [][] arr = {
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
			};
		
			// 배열 arr의 총합과 평균을 구하시오
			// 총합 :
			// 평균 :
			
			int sum = 0;
			int count = 0;
			double avg = 0.0;
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
					count++;
				}
			}
			
			avg = (double)sum/count;
			System.out.println("총합 : " + sum);
			System.out.println("평균 : " + avg);
			
			
			
			
			System.out.println("-------------------------------------");
			
			
			
			
			
			// 학생들의 정보를 입력하고 출력하는 프로그램 작성하기
			// 학생들의 수학과 영어 성적을 입력 받고 등록하는 프로그램입니다.
			// 1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력 받는다.
			// 2. 입력 받은 수 만큼 학생들의 이름, 수학, 영어 성적을
			// 입력 받는 프로그램 작성하기

			Scanner sc = new Scanner(System.in);
			
			int[][] arr2 = new int[3][];
			System.out.print("인원수를 입력하세요. : ");
			int number = sc.nextInt();
			
			
			
			for(int i = 1; i <= number; i++) {
					
			}
			
			System.out.print("이름을 입력하세요. : ");
			String name = sc.toString();
			System.out.print("수학 점수를 입력하세요. : ");
			String math = sc.toString();
			System.out.print("영어 점수를 입력하세요. : ");
			String eng = sc.toString();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
