package ex01_setter_getter;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		// 필드를 priavate 으로 선언하면 외부에서 필드를 직접 사용할 수 없다.
		// p.age = 30;
		
		// setter 메서드를 통해서 필드에 값을 세팅
		p.setAge(30); // 메서드 활용
		
		System.out.println(p.getAge());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
