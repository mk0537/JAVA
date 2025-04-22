package ex02_class_casting;


class Parent {};

class Child extends Parent {};





public class Example {
	public static void main(String[] args) {
		Parent p1 = new Parent(); // 부모 타입의 p1 객체 생성
		Child c1 = new Child();// 자식 타입의 c1 객체 생성
		
		Parent p2 = new Child(); // 자동 타입 변환
		Parent p3 = c1; // 이미 만들어진 자식 객체에 대한 타입 변경 (자식 -> 부모 는 됨)
		// Child  c2 = p1; -> 자동 타입 변환 불가 (부모 -> 자식 은 안됨)
		
		
		// 기본 자료형끼리 비교할 때의 == 연산자는 값이 같은 지 비교 하지만
		// 객체끼리 비교할 때의 == 연산자는 주소값을 비교한다.
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있다.");
		}
		
		
		
		
		
		
		
		
		
	}
}
