package ex01_if;
import java.util.Scanner;

public class Ex01_if {

	public static void main(String[] args) {
// 		단순 if문
// 		조건문 중에서도 가장 기본이 되는 명령문
		
// 		if (조건식) {
// 			조건식이 참일 때 실행할 문장
//		}

//		만약 실행해야 하는 명령이 하나라면 중괄호 생략 가능
//		
//		if(조건식) 조건식이 참일 때 실행할 문장;
//		
//		간결하고 가독성이 좋은 코드를 중괄호와 들여쓰기
//		중괄호 블록은 여러 개의 수행문을 하나로 묶기 위해 작성.
//		수행문이 하나일 경우 생략할 수 있지만 중괄호를 사용하면
//		가독성이 좋을 뿐 아니라 코드의 해석이 용이하고 버그를
//		찾아 수정하는 데에 도움이 되므로 중괄호를 쓰는 습관을 기르자 !

//		중괄호를 사용할 때는 들여쓰기를 하는 것이 좋다.
		
		int result = 0;
		if (3 > 2) {
			result = 3;
		}
		System.out.println(result);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		int age = sc. nextInt();
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
	}

}
