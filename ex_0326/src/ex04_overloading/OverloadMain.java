package ex04_overloading;

public class OverloadMain {

	public static void main(String[] args) {
		Overload ol = new Overload();
		
		
		// 같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다.
		ol.result(); //인자가 없는 메서드
		ol.result(100); //정수를 인자로 받는 메서드
		ol.result("hello", 0); // 문자열, 정수를 인자로 받는 메서드
		ol.result(0, "hello"); // 정수, 문자열을 인자로 받는 메서드
		
		
	}

}
