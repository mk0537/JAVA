package exam2;

// 입력한 숫자의 합, 차, 평균 구하기
// Calc 클래스 만들어서 상속 받기
public abstract class Calculator {
	
	// 합 메서드
	public abstract int add(int a, int b);
	
	// 차 메서드
	public abstract int substract(int a, int b);
		
	// 평균 메서드
	public abstract double average(int a[]);
		

}

class Calc extends Calculator{
	// 합 메서드
	@Override
	public int add(int a, int b) {
		return a + b;
	}
		
	// 차 메서드
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
			
	// 평균 메서드
	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int x : a ) {
			sum += x;
		}
		double avg = sum / a.length;
		return avg;
	}

}
