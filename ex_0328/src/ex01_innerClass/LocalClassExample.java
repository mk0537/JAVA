package ex01_innerClass;

public class LocalClassExample {
	private int speed = 10;
	
	// 일반메서드
	public void getUnit(String unitName) {
		
		// unitName = unitName + "님";
		
		// 내부 클래스
		class Unit{
			
			// 내부 클래스의 메서드
			public void move() {
				System.out.println(unitName+"이 "+speed+ " 속도로 이동합니다.");
			}
		}
		
		Unit unit = new Unit();
		unit.move();
		
	}
	
	public static void main(String[] args) {
		
		// LocalClassExample 클래스 타입의 'local' 이라는 객체 생성
		LocalClassExample local = new LocalClassExample();
		
		// LocalClassExample 클래스 안에 있는 getUnit 메서드 호출
		local.getUnit("마린");
		
	}
	
	// 지역 내부 클래스를 사용하는 이유
	// 1. 클래스를 외부로 뺼 필요 없이 한정된 범위 내에서만 잠깐 사용할 수 있다.
	// 		ㄴ 재사용성이 없고, 해당 메서드에만 사용하는 클래스라면 
	//   		외부에 클래스로 선언하지 않아도 돼서 코드가 간결해짐
	// 2. 상태나 기능이 조금 있는 일시적인 도우미 객체가 필요할 떄
	// 		ㄴ 단순 변수, 함수로는 부족할 때
	// 		ㄴ 일회성 객체에 상태/기능을 동시에 담고 있을 때
	
	
}
