package exam1;

public class Car {
	int gasGuage;
	
	// 부모 생성자 
	public Car(int gasGuage) {
		this.gasGuage = gasGuage;
	}
	public void showCurrentGuage() {
		System.out.println("잔여 가스량 : " + gasGuage);
	}
}
