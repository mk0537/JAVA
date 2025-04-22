package ex04_overloading;

public class Converter {
	
	// 1. cm -> m 로 반환하는 convert
	public void convert(double cm) {
		double m = cm / 100;
		System.out.printf("%.3fcm는 %.3fm 입니다. \n",cm,m);
	}
	
	// m, inch -> cm로 변환하는 convert
	// inch -> cm : inch * 2.54
	public double convert(double value, String unit) {
		if(unit.equals("m")) {
			return value * 100.0;
		} else if (unit.equals("inch")) {
			return value * 2.54;
		} else {
			return 0;
		}
	}
}
