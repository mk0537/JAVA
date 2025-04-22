package ex04_overloading;

public class Overload {
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	// 매개변수의 갯수가 다를 때의 오버로딩 (가능)
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	
	// 매개변수의 갯수가 같지만 타입이 다를 때
	public void result(char a) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	// 매개변수의 갯수와 타입이 다를 때
	public void result(String s, int n) {
			System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
		
	// 매개변수의 갯수와 타입이 같지만 순서가 다를 때
	public void result(int n,String s) {
			System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	
	
	
}
