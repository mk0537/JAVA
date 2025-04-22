package ex02_class_casting;

public class FourWheelBike extends Bike {
	public FourWheelBike(String riderName) {
		super(riderName);
	}
	
	@Override
	public void info() {
		super.info(); //부모 info() 메서드 호출
	}
	
	public void addWheel() {
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName+"의 자전거에 보조 바퀴를 부착하였습니다.");
		} else {
			System.out.println(riderName+"의 자전거에 이미 보조 바퀴가 부착되어 있습니다.");
		}
	}
	
	
	
	
}
