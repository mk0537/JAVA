package ex04_exam;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 입금
		// 출금
		// 잔액확인
		// 종료

		// 키보드에서 값을 입력 받아서 메뉴를 선택할 시 각각의 기능을 호출한다.
		// 종료를 선택하면 프로그램이 종료된다.
		
		UserInfo user = new UserInfo();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액확인");
			System.out.println("4. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.print("입금 금액 : ");
				int money = sc.nextInt();
				user.deposit(money);
				break;
			case 2 :
				System.out.print("출금 금액 : ");
				money = sc.nextInt();
				user.withDraw(money);
				break;
			case 3 :
				System.out.printf("현재 잔액은 %d원입니다. \n",user.showMoney() );
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.\n");
				return; // 함수 자체를 빠져나감
			}
		System.out.println("--------------------------------");
		}
		
		
	}

}
