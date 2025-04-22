package exam1;

public class HybridCar extends Car {
	int electricGuage;
	
	// Car의 자식 생성자이자 HybridWaterCar의 부모 생성자
	public HybridCar(int gasGuage, int electricGuage) {
		// 부모 클래스에 매개변수를 받는 생성자만 있고 
		// 기본 생성자(super();)가 없기 때문에 반드시 명시적으로 super(...)를 호출해야 함
		super(gasGuage); // 자식 클래스의 생성자는 반드시 부모 클래스의 생성자를 호출해야 함
		this.electricGuage = electricGuage;
	}
	
	
	@Override
	public void showCurrentGuage() {
		super.showCurrentGuage();
		System.out.println("잔여 잔여량 : " +  electricGuage);
	}
}
