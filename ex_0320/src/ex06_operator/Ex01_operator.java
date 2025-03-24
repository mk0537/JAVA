package ex06_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		// 1. 단항연산자
		// 항이 한 개인 연산자
		
		// 부호 연산자
		int x = 100;
		int resultPlus = +x; // '+' 생략 가능
		int resultMinus = -x;
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		
		// 2. 증감 연산자
		// 1씩 증가시키거나 1씩 감소시키는 연산자
		
		// 선행증감 (++x) : 1이 먼저 증감 -> 코드에 즉시 반영
		int a = 10;
		System.out.println("a : " + ++a);
		// 후행증감 (x++) : 코드가 먼저 실행 -> 1이 증감
		int b = 10; // ② b=11
		System.out.println("b : " + b++); // ① b=10
		
		char alphabetA = 'A'; // ③ 67
		System.out.println(alphabetA++); // ① A(65)
		System.out.println(alphabetA++); // ② B(66)
		
		
		// 오버플로우와 언더플로우
		
		byte value = 127; // byte의 최대 값
		value++; // 128
		System.out.println(value);// -128(byte의 최소 값)
		// 오버플로우가 일어나면 최소값으로 바뀜
		
		
		byte value2 = -128;
		value2--; // -129
		System.out.println(value2); //127
		// 언더플로우가 일어나면 최대값으로 바뀜
		
		
		// 논리 부정 연산자 -> !
		// 논리형 값을 가지는 피연산자 앞에 !를 붙여서
		// 값을 반대로 바꾸는 역할
		// 연산자를 사용한 곳에서만 적용이 될 뿐, 진짜 변수의 값이 바뀌는 건 아님
		boolean isHuman = false;
		System.out.println(!isHuman); // true (이 코드에서만 적용)
		System.out.println(isHuman); // false
		
		

	}

}
