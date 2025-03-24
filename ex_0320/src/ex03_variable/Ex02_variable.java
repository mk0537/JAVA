package ex03_variable;

public class Ex02_variable {

	public static void main(String[] args) {
		// 변수의 유효 범위 (scope)
		// 모든 변수는 만들어진 중괄호 안에서만 사용할 수 있다.
		String favoriteFood;
		
		if(10 > 5) {
			favoriteFood="제육";
			System.out.println(favoriteFood);
		} //if 끝

	}//main 끝
		// favoriteFood="제육"; -> 중괄호 밖에서 사용했으므로 Error
		
}
