package ex02_lamda;

public class Ex01_function {

	public static void main(String[] args) {
		// 람다식
		Iadd add = (x, y) -> x + y;
		// result 메서드의 매개변수로 람다식 add 를 전달 
		int res = result(add);
		
		System.out.println("res : " +  res);
		
	}
	
	// 메서드 구현
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}

}
