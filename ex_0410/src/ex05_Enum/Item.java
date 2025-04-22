package ex05_Enum;

// 특별한 형태의 클래스이다.
// 클래스처럼 필드, 생성자, 메서드를 가질 수 있다.
public enum Item {
	// public static final Item START = new Item();
	// 객체를 만들기 위한 생성자를 호출하는 것이라고 생각한다.
	// 각각의 상수들은 Item 클래스로 만든 객체라고 생각하면 된다.
	START("시작",">"), // Item START = new Item("시작",">");
	STOP("정지","||"),
	EXIT("종료", "X");

	// 각각의 상수에 필드 추가하기
	
	// 필드의 선언
	String itemStr;
	String symbol;
	
	// 생성자의 선언
	// 열거형의 생성자는 기본적으로 무조건 private !
	Item(String itemStr, String symbol){
		this.itemStr = itemStr;
		this.symbol = symbol;
	}
	
	
	// 메서드의 선언
	public String getItemStr() {
		return itemStr;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	
	
	
	
	
	
	

}



