package ex01_innerClass;

public class PermitExample {
	private class InClass{
		public void print() {
			System.out.println("접근을 private 으로 제한한다.");
		}
	}
	
	// 반환값이 new InClass(); 이므로 반환 타입이 InClass여야 한다.
	public InClass getInClass() {
		return new InClass();
	}
	
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		
		// InClass 가 private 이라서 내부 클래스의 객체를 직접 만들 수 없다.
		//PermitExample.InClass =permit.new InCalss();
		
		permit.getInClass().print();
	}
}
