package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

// QuizThread 클래스를 만들어 스레드를 상속 받는다.
// startGame() 메서드를 만들고 그 안에서 1 ~ 100 사이의 난수 2개를 더하는 문제를 출력
// 키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복한다.

// 모든 문제를 맞추는 데 몇 초가 걸렸는지를 화면에 출력하며
// 프로그램을 종료하기
class QuizThread extends Thread {
	 
	@Override
	public void run() {
		
	}
	
	public void startGame() {
		int cnt = 5;
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int random = r.nextInt(100)+1;
		
		for(int i = 0; i >= cnt; i++ ) {
			while(true) {
				System.out.print("숫자 입력 : ");
				int number = sc.nextInt();
				
				if (random == number) {
					System.out.println("정답입니다.");
					cnt++;
					if(cnt == 10) {
						break;
					}
				} else if (random > number) {
					System.out.println("숫자가 더 큽니다.");
					continue;
				} else if (random < number) {
					System.out.println("숫자가 더 작습니다.");
					continue;
				}
			}
		}
	}
}


public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		
		qt.start();
		qt.startGame();
	}
}
