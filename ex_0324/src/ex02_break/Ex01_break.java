package ex02_break;

public class Ex01_break {

	public static void main(String[] args) {
		// break문으 switch를 핳 때 나왔던 구문을  case를 종룧라 때 사용
//		반복문이 진행되는 도중, 특정 조건을 만족해 더이상 반복문을 실행할 필요 없이
//		종료하려고 할 때 사용됨
		
		for(int i = 0; i < 10; i++) {
			if (i == 5 ) {
				break;
			}
			System.out.println(i+" ");
		}
		
		
		System.out.println();
		
		
		int s = 0;
		while(s < 10) {
			if (s == 5) {
				break;
			}
			System.out.println(s+" ");
			s++;
		}
		
		System.out.println();
		
		
		// break, continue 와 같은 기타 제오문은
		// 반복문 안에서만 사용할 수 있다.
		
		// 기타제어문 밑에는 코드가 올 수 없다
		
		
		
		
		
		
		
		
		
		

	}

}
