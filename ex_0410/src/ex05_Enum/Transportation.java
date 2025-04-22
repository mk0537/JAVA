package ex05_Enum;

// 추상메서드를 가진다고 해서 추상클래스가 되는 것은 아니다.
// enum 자체는 추상메서드를 정의할 수가 있지만
// 상수들이 그 메서드를 구현해야 한다.
public enum Transportation {
	
	// 익명클래스 안에 오버라이드를 해주어야 O
	BUS(1200) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	}, 
	
	TRAIN(1400) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	}, 
	
	SHIP(5400) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	}, 
	
	AIRPLANE(89000) {
		@Override
		int totalFare(int distance) {
			return distance * fare;
		}
	};
	
	
	int fare;
	
	
	private Transportation(int fare) {
		this.fare = fare;
	}
	
	// 추상메서드를 정의하면
	// 직접 구현을 해야 한다며 오류가 난다.
	abstract int totalFare(int distance);
	
	
	
	
	
	
	
	
	
}
