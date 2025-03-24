package ex06_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		// 이항연산자
		// 피연산자가 2개인 연산자
		
		// 산술 연산자
		int x = 100;
		int y = 200;
		
		System.out.println(x + y); //300
		System.out.println(x - y); // -100
		System.out.println(x * y); // 20000
		System.out.println(x / y); // 0
		System.out.println(x % y); // 100
		
		// 오버플로우 발생
		int result = 1000000 * 1000000; // 1000000000000
		System.out.println(result); // -727379968 (이상한 값)
		
		// 산술 변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의 타입이
		// 일치해야 연산이 가능하다.
		
		// 컴퓨터는 서로 다른 타입을 계산하지 못하므로
		// 값이 손실이 적은 쪽으로 타입을 맞춰준다.
		// long(8byte) + int(4byte) => long + long -> long
		// float + int => flaot + float => float
		// double + float => double + double => double
		
		// 대입연산자
		// 우변의 값을 좌변에 대입해주는 연산자
		
		// 복합대입연산자
		// 산술연산자와 대입연산자가 합쳐진 상태
		// A = A +,-,*,/,% B
		
		x = 10;
		y = 1;
		
		y += x; // y = y + x;
		System.out.println("y = " + y); // 11
		
		y *= x; // y = y * x;
		System.out.println("y = " + y); // 110
		
		// [++x] = [x += 1] = [x = x + 1]
		
		
		// 비교연산자 (>, <, ==, !=)
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		// 결과가 항상 true나 false로 반환된다.
		
		int a = 10;
		int b = 20;
		
		System.out.println(a > b); // false
		System.out.println(a < b); // true
		System.out.println(a == b); // 같다 false
		System.out.println(a != b); // 같지 않다 true
		
		
		// 논리연산자
		int myAge = 30;
		int limit = 35;
		
		// &&(and) : 둘다 참이어야 참
		boolean res = (limit - myAge) >= 5 && myAge > 30;
		System.out.println("&& 연산결과 : " + res); // false(0)
		// ||(or) : 둘 중 하나만 참이어도 참
		res = (limit - myAge) >= 5 || myAge > 30;
		System.out.println("|| 연산결과 : " + res); // true(1)
		
		
	}

}
