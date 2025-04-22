package ex05_Enum;

public class OrderedMain {

	public static void main(String[] args) {
		OrderStatus status = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next(); // 예외발생
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
	
		
		
		
		
		

	}

}
