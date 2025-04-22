package ex01_innerClass;

interface buttonClickListner{
	public void click();
	
}

public class AnonymousExample {
	// 내부 클래스
	public class Button{
		// 내부 클래스의 buttonClickListner 타입의 멤버변수(필드)
		// 인터페이스의 구현체는 다 들어올 수 있다.
		private buttonClickListner listner;
		
		/** 멤버변수는 private 으로 지정하는 일이 많기 때문에 직접 접근하는 것이 불가능하다.
		 public 으로 된 메서드를 통해서 접근을 하는 일이 많다.
		 	ㄴ setter(셋팅) & getter(반환)                                         */
		public void setListner(buttonClickListner listner) {
			this.listner = listner;
		}
		
		public void click() {
			if(listner != null) {
				this.listner.click();
			}
		}
	}
	
	public static void main(String[] args) {
		// 외부 클래스의 객체
		AnonymousExample exam = new AnonymousExample();
		// 내부 클래스의 객체(외부 클래스의 객체로 부터 생성)
		AnonymousExample.Button button = exam.new Button();
		
		
		// setListner의 매개변수로 (이름이 없는)익명 클래스로 메서드 오버라이드 
		button.setListner(new buttonClickListner() { // 익명 클래스 선언
			@Override
			public void click() {
				System.out.println("버튼 클림됨");
			}
		} // 익명 클래스 끝 
		);
		
	}
}
