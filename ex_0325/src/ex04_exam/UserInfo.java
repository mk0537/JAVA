package ex04_exam;
import java.util.Scanner;

public class UserInfo {
	int money;
	int tongjang;
	String menu;

	
	Scanner sc = new Scanner(System.in);
	
	// 유저가 돈을 입금했을 경우를 처리
	public void deposit(int money) {
		tongjang += money;
		System.out.printf("%d원이 입금되었습니다. \n", money);
		System.out.printf("현재 잔액은 %d원입니다. \n",tongjang);
	}
	
	// 유저가 돈을 출금했을 경우를 처리
	public void withDraw(int money){
		if (tongjang > money) {
			tongjang -= money;
			System.out.printf("%d원이 출금되었습니다. \n", money);
			System.out.printf("현재 잔액은 %d원입니다. \n",tongjang);
		} else {
			System.out.println("잔액이 부족합니다.");
			System.out.printf("현재 잔액은 %d원입니다. \n",tongjang);
		}
	}
	
	// 현재 잔액을 반환하는 메서드
	public int showMoney() {
		return tongjang;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
