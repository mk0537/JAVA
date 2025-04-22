package exam1;

public class HybridWaterCar extends HybridCar{

	int waterGauge;
	
	// HybridCar의 자식생성자
	public HybridWaterCar(int gasGuage, int electricGuage, int waterGauge) {
		// 부모 클래스에 매개변수를 받는 생성자만 있고 
		// 기본 생성자(super();)가 없기 때문에 반드시 명시적으로 super(...)를 호출해야 함
		super(gasGuage, electricGuage); // 자식 클래스의 생성자는 반드시 부모 클래스의 생성자를 호출해야 함
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGuage() {
		super.showCurrentGuage();
		System.out.println("잔여 워터량 : " +  waterGauge);
	}
}
