package ex05_Scanner;
import java.util.Scanner; // 다른 클래스, 인터페이스, 또는 다른 요소들의 클래스를 사용하기 위해 import

public class Ex01_Scanner {

	public static void main(String[] args) {
		// 데이터의 입력
		// 프로그램을 실행할 때 키보드를 통해 입력한 데이터를 변수에 대입하는 것
		
		// java.util 패키지에 있는 Scanner 클래스를 이용해야 한다.
		// 다른 패키지에 있는 기능을 사용하기 위해서는 import 를 해야한다.
		// import 경로
		Scanner sc = new Scanner(System.in); // Scanner 객체 선언
				
//		System.out.print("정수 입력 :");
//		int n = sc.nextInt(); // 정수 입력받기
//		System.out.println(n);
		
		
		// 나이 입력 받기
		// 제 나이는 x세 입니다.
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		System.out.print("이름 입력 :");
		String name = sc.next(); // 띄어쓰기 해버리면 끝남
		sc.nextLine(); // Enter 값을 먹어주는 역할
		System.out.print("주소 입력 :");
		String address = sc.nextLine(); // Enter 치면 끝남
		System.out.printf("제 나이는 %d세입니다. ",age);
		System.out.printf("제 이름은 %s입니다. ", name);
		System.out.printf("제 주소는 %s입니다. ",address);
		
		
		
		
		
		
		
	}

}
