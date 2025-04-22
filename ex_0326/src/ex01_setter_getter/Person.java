package ex01_setter_getter;

public class Person {
	// 일반적으로 setter 메서드를 사용할 때는
	// 필드의 값을 객체 외부에서 직접 접근하지 못하도록 제한(private)
	private int age; 
	
	
	// setter : 나이의 값을 설정하는 메서드
	// 해당 메서드가 setter 역할을 하는 메서드임을 알려주는 방법은
	// 메서드명의 접두사에 set을 붙인다.
	// 기능은 일반 메서드와 같음!!!!
	public void setAge(int num) {
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다.");
			return; // 메서드 종료
		}
		age = num; // num을 age 필드에 대입
	}
	
	
	// getter : 값을 반환하는 메서드
	// 메서드가 getter임을 알 수 있는 방법은 메서드 앞에 get 접두사를 붙힌다.
	
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
