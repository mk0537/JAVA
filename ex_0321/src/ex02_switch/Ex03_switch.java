package ex02_switch;

public class Ex03_switch {

	public static void main(String[] args) {
		// java 12 이상으로 업데이트 되면서 switch의 문법이 새롭게 만들어졌다
		// 조건절에 복수 개의 값을 사용하는 것이 가능해졌다.
		// 화살표 표현식을 이용하는 게 가능하다.
		
		String day = "Monday";
		
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thirsday":
		case "Friday":
			System.out.println("평일");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("주말");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		
		// 조건식에 복수 개의 값 가능, 화살표 가능
		// 기존의 switch 문과는 달리 case 에 해당하는 절만 실행되고
		// 그 후의 case 는 실행되지 않는다. 
		switch(day) {
		case 
			"Monday", 
			"Tuesday", 
			"Wednesday", 
			"Thirsday", 
			"Friday" -> System.out.println("평일");
		case 
			"Saturday",
			"Sunday" -> System.out.println("주말");
		default -> System.out.println("잘못된 입력입니다.");
		}
		
		
		
	}

}
