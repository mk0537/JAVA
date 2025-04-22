package ex04_API;

public class Ex02_toString {

	public static void main(String[] args) {
		// toString() 메서드 : 객체의 문자 정보를 반환해주는 메서드
		// print()문을 이용해 객체를 출력할 경우 toStrin() 메서드가 
		// 자동으로 실행되어 객체의 정보를 반환해주고 출력이 된다.
		
		Object obj = new Object();
		System.out.println(obj.toString()); // 2f4d3709 (주소가 나옴)

	}

}
