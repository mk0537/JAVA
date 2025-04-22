package ex02_constructor;

public class SnackMain {

	public static void main(String[] args) {
		// 생성자 : 특수한 기능을 가진 메서드다
		// 메서드는 선언을 한 뒤 호출해야하는데, 우리는 따로 생성자를 선언한 적이 없다.
		// 
		
		
		Snack chip = new Snack(5000);
		chip.info();
		
	}

}
