package ex02_class_casting;

public class DeskCalendar extends Calendar{
	
	public DeskCalendar(String color, int months) {
		super(color,months); // 부모 생성자 호출
	}
	
	@Override
	public void info() {
		System.out.println(color+" 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void onTheDesk() {
		System.out.println(color+" 달력을 책상에 세울 수 있습니다.");
	}

}
