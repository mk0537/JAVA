package ex04_exam;

import java.util.Random;
import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		int[] arr = {1,2,3,4,5};
		
		mt.maxFinder(arr);
		
		
		System.out.println("----------------------------------");
		
		
		mt.circleArea(5);
		System.out.println("원의 둘레 : "+ mt.circleRound(5)); 
		
		
		System.out.println("----------------------------------");
		
		
		mt.calculator(10, 5, '+');
		
		
		System.out.println("----------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(mt.check(num).equals("정답")) {
				System.out.println("정답!");
				System.out.println(mt.count+ "회 만에 정답입니다.");
				break;
			}else {
				System.out.println(mt.check(num));
				mt.count++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
