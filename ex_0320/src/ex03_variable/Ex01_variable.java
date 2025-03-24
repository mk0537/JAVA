package ex03_variable;

public class Ex01_variable {

	public static void main(String[] args) {
		// 변수
		// 프로그램을 만들고 실행하는 데 필요한 값들을 모두
		// 메모리에 저장해두고, 필요할 때마다 꺼내서 사용
		
		// 메모리에 무질서하게 저장되는 것이 아니라
		// 메모리 규칙 속에서 일부 공간을 할당받아야 한다.
		
		// 메모리에 값을 저장하기 위해 할당해놓은 특정 공간을
		// 변수라고 한다.

		// 1. 변수의 선언
		// 변수를 사용하기 위해서는 우선 선언을 해야한다.
		// 자료형 변수명;
		
		// 변수명 짓는 규칙
		// 1. 숫자, 특수문자 ($, _ 제외) 가 첫 글자로 올 수 없다
		// 2. 대소문자 구별
		// 3. 일반적으로 영어 소문자로 시작
		// 4. 특수문자 포함 X
		// 5. 예약어 금지
		// 6. 한글 사용 X

		// 표기법
		// 1. 카멜표기법 : 두 번째 단어부터 첫 글자 대문자로 표기
		// userName, homeAdress
		
		// 2. 스네이크 표기법 : 모든 단어가 소문자로 시작하고 단어와 단어 사이는
		// 					_ 로 연결하는 방식
		// user_name, home_adress
	
		// 변수에 데이터 입력하기
		// 데이터를 직접 입력하는 대신 변수에 저장하고 변수명을 사용하여 값을 사용한다.
		
		int studentAge; // 변수 선언
		studentAge = 20; // 변수 값 설정
		
		System.out.println(studentAge); // 변수 출력
		
		
		boolean b = false; // b에 1 또는 문자열 X
		System.out.println("b의 값 : " + b);
		// 자바는 변수의 타입을 엄격하게 지켜야 한다.
		
		// 문자형
		char ch = 'a'; // 딱 한 글자만 가능
		System.out.println("ch의 값 : " + ch);
		
		// 아스키 코드 값 때문에 에러가 나지 않는다.
		char ch2 = 65;
		System.out.println("ch2의 값 : " + ch2); // 아스키코드로 인식. A 출력
		
		// 정수형
		byte by = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("by의 값 : " + by);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
		// 실수형
		float f1, f2;
		
		// java 에서는 실수의 타입을 double 형으로 인식하기 때문에 
		// 데이터가 float 타입이라는 것을 명시해주어야 함.
		f1 = 3.14f; // 뒤에 f 
		f2 = 150;
		
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2); // 정수도 실수형을 표시
	
		
		int myAge = 20;
		int yourAge = myAge; // 여기서 대입이 끝났기 때문에
		
		myAge = 21; // 여기서 값이 바뀌어도 yourAge 값은 변하지 X
		System.out.println(yourAge); // 20
		
		
		// 두 변수에 들어있는 값을 교환하려면 어떻게 해야할까?
		// 물이 들어있는 두 컵을 교환할 수는 없음.
		// 빈 컵을 하나 더 만들어서 삼자교환해야 함.
		int su1 = 20, su2 = 30;
		
		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		int temp; // 빈 컵 생성 (임시로 담을 변수 생성)
		
		temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		
	}

}
