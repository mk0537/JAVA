package ex01_innerClass;

public class PersonMain {

	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		// 생성자 선언과 동시에 메서드 오버라이드
		Person p = new Person() {
			@Override
			public void mySelf() {
				System.out.println("저는 회사원입니다.");
			}
		};
		
		
	}
}
