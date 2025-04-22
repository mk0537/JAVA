package ex04_interface;

public interface Menu1 {
	// 상수 : 값을 한 번 넣으면 변경이 불가능 함
	final String name = "홍길동";
	
	
	// 인터페이스에서는 어차피 추상메서드만 들어갈 수 있기 때문에
	// abstract 를 생략해도 된다.
	public String jajang(); // 추상메서드
	
	
	// default 접근 제한자를 가진 메서드는 정의가 가능하다
	default void f() {
		System.out.println("default 메서드");
	}
	
	
	
}
