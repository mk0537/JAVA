package ex03_polymorphism;

public class Samsung extends Computer {
	
	@Override
	public void powerOn() {
		super.powerOn(); // 부모 powerOn() 메서드 호출
		System.out.println("아이 러브 삼송");
	}
	
	
}
