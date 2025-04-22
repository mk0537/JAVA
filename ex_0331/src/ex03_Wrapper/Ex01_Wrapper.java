package ex03_Wrapper;

public class Ex01_Wrapper {

	public static void main(String[] args) {
		// Wrapper 클래스 
		// 프로그램에 따라 기본 타입의 데이터를 객체형으로 표시해야 하는 경우
		// 이를 위해 자바에서는 기본 자료형을 객체로 다루기 위한 클래스를 제공한다.
		// 이를 Wrapper 클래스 라고 부르는데 기본형의 데이터 타입을 클래스로 포장했기 때문이다.
		
		// <형태>
		// int -> Integer
		// char -> Character
		// float -> Float
		// double -> Double
		
		
		// 생성자를 통한 선언은 JDK 1.9 부터 사용하지 않는 것을 권장
		Integer num01 = new Integer(10); // 객체1

		Integer num02 = Integer.valueOf(10); // 객체2
		
		Double dnum = Double.valueOf(30.11); // 객체3
		
		
		
	}

}
