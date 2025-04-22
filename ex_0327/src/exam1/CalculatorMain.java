package exam1;

public class CalculatorMain {

	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		System.out.println("CalPlus : " + cp.getResult(15, 15));
		
		CalMinus cm = new CalMinus();
		System.out.println("CalMinus : " + cm.getResult(30, 15));

	}

}
 