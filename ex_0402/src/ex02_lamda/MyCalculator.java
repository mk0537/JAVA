package ex02_lamda;

// 함수형 인터페이스가 되기 위한 조건 :
// 무조건 추상 메서드가 1개여야 한다.

@FunctionalInterface // 이 어노테이션을 선언한 순간 무조건 1개의 추상 메서드가 있어야 한다. 0개도 안되고 2개도 안됨.
public interface MyCalculator {
	// 1개의 추상 메서드
	int plus(int num1, int num2);
	
	
}
