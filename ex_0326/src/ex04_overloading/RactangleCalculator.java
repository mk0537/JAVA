package ex04_overloading;

public class RactangleCalculator {
	// 다양한 방식으로 사각형의 넓이 구하기
	// 메서드 명 : area
	
	// 1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	public void area(int a) {
		int area = a*a;
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이는 %d입니다. \n",a,area);
	}
	// 2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	public void area(int x, int y) {
		int area = x * y;
		System.out.printf("가로의 길이가 %d, 세로의 길이가 %d인 직사각형의 넓이는 %d입니다.\n",x,y,area);
	}
	// 3. 실수형 가로 세로 길이를 받아 실수 결과 반환하기
	public void area(double c, double d ) {
		double area = c * d;
		System.out.printf("가로의 길이가 %.1f, 세로의 길이가 %.1f인 직사각형의 넓이는 %.2f입니다.\n",c,d,area);
	}
	
	
	
	
	
}
