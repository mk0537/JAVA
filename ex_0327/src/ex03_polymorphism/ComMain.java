package ex03_polymorphism;

public class ComMain {

	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		// Computer com1 = new Samsung();
		cr.com1 = new Samsung(); // 객체 멤버변수(cr.com1)에 새로운 Samsung 타입의 객체 대입
		
		// Computer com2 = new LZ();
		cr.com2 = new LZ();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		
		
		
	}

}
