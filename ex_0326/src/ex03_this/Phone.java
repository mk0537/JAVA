package ex03_this;

public class Phone {
	// 멤버변수(필드) 설정
		String brand;
		int series;
		String color = "검정색";
		

		// this()
		// 같은 클래스 안에 있는 생성자 중 매개변수의 개수, 자료형, 순서에 맞는
		// 다른 생성자를 호출하는 메서드로 생성자 내부에서만 사용할 수 있다.
		
		
		
		// 생성자2 : 매개변수 2개가 다 들어와야 객체생성이 가능
		public Phone(String b, int s) {
			brand = b;
			series = s;
		}
		
		
		// 생성자3 : 매개변수 3개가 다 들어와야 객체생성이 가능
		public Phone(String b, int s, String c) { 
			this(b,s); // 첫줄에서만 호출 가능
			color = c;
			
		}
		
		public void phoneInfo() {
			System.out.println(color + " "+ brand + " " + series);
		}
}
