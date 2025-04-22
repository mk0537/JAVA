package ex04_exam;

import java.util.Random;

public class MethodTest {
		// 배열의 최대값을 찾는 maxFinder 메서드 만들기
		// 임의의 배열은 매개변수로 받기
		
		public void maxFinder(int arr []) {
			int max = arr[0];
			for(int x : arr ) {
				if ( x > max )
					max = x;
			}
			System.out.println("최대값 : " + max);
		}
		
		
		// 원의 넓이와 둘게 구하기
		// 함수를 호출하면서 반지름을 받는다.
		// 원의 넓이를 구하는 circleArea
		// 원의 둘레를 구하는 circleRound
		// circleArea는 결과 출력하기
		// circleRound는 결과 반환하기
		// 원의 넓이 : 3.14 * r * r;
		// 원의 둘레 : 2 * 3.14 * r;
		
		
		public void circleArea(int r) {
			double area = r * r * 3.14;
			System.out.println("원의 넓이 : " + area);
		}
		
		public double circleRound(int r) {
			double round = 2 * r * 3.14;
			return round;
		}
		
		
		
		// 계산기 만들기
		// 사칙연산을 할 수 있는 calculator 메서드 만들기
		// 두 수와 연산자를 매개변수로 받는다
		
		public void calculator(int x, int y, char op) {
			switch(op) {
			case '+':
				System.out.printf("%d + %d = %d\n", x, y, x + y);
				break;
			case '-':
				System.out.printf("%d + %d = %d\n", x, y, x - y);
				break;
			case '*':
				System.out.printf("%d + %d = %d\n", x, y, x * y);
				break;
			case '/':
				System.out.printf("%d + %d = %d\n", x, y, x / y);
				break;
			}
		
		}
			
		// 1 ~ 50 사이의 난수를 생성
		// main 쪽에서 키보드를 통해 정수를 입력 받는다.
		// check() 메서드를 만들어서 사용자가 입력한 숫자를 판단
		// 발생한 난수보다 크다면 'DOWN!' 작다면 'UP!' 출력
		// 사용자가 입력한 숫자와 발생한 난수가 같을 경우 프로그램 종료
		// 몇 회만에 맞춰는지 판단하기
			
	
		Random r = new Random();
		int random = r.nextInt(50)+1;
		
		int count = 1;
		// 사용자가 입력한 숫자와 난수를 체크하는 기능
		public String check(int num) { 
			
			while(true) {
				count++;
	            
	            if(num < random) {
	                 return "Up";
	            } else if (num > random) {
	            	return "Down";
	            } else if (num == random){
	            	return "정답";
	            }
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
}
