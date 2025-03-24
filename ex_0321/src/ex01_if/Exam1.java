package ex01_if;

public class Exam1 {

	public static void main(String[] args) {
		// 삼항 연산자로 만들었던 x개의 농구공을 담기 위한 박스의 개수 구하기
		int ball = 23;
		int box = 0;
		int result = ball/box;
		
		if(result == 0 ) {
			System.out.println("박스는 "+ result + "개가 필요합니다.");
		} else
		{
			System.out.println("박스가 부족합니다.");
		}
		
	}

}
