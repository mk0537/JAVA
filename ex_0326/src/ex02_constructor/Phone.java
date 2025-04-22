package ex02_constructor;

public class Phone {
	// 멤버변수(필드) 설정
	String brand;
	int series;
	String color = "검정색";
	
	// 자바에서는 외부에서 제공할 수 있는 데이터 만큼만 매개변수로 전달하여 
	// 객체를 생성할 수 있다.
	// 생성자를 다양한 형태로 선언하는 것을 '생성자 오버로딩' 이라고 한다.
	// (원래 메서드는 같은 이름 안됨!)
	
	// 오버로딩이 가능한 경우
	// 1. 매개변수의 개수가 다를 때 
	// 2. 매개변수의 개수가 같아도 자료형이 다를 때
	// 3. 생성자나 메서드의 이름은 그대로 사용하기
	
	
	
	// 생성자2 : 매개변수 2개가 다 들어와야 객체생성이 가능
	public Phone(String b, int s) {
		brand = b;
		series = s;
	}
	
	
	// 생성자3 : 매개변수 3개가 다 들어와야 객체생성이 가능
	public Phone(String b, int s, String c) { 
		brand = b;
		series = s;
		color = c;
		
	}
	
	public void phoneInfo() {
		System.out.println(color + " "+ brand + " " + series);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
