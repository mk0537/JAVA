package ex05_inheritance;

// 자식클래스
public class Customer extends Person {
int memberId;
	
	public Customer(String name,int age, int memberId) {
		super(name,age);
		this.memberId = memberId;
	}
	
	void enter() {
		System.out.println("회원번호 : " + memberId +" (" + name+", "+age+"세) 님 입장하셨습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
