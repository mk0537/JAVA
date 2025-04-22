package ex04_API;

public class Car {
	private String carName;
	private String company;
	
	public Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	// 모든 클래스는 Object 를 상속받는다
	
	@Override
	public String toString() {
		String str = "차랑 이름 : " + this.carName + ", 제조사 : " + this.company;
		return str;
	}
	
	
}
