package ex01_Thread;

import java.util.Scanner;

// 스캐너를 이용하여 키보드에서 숫자를 입력 받고
// 스레드에서 입력 받은 숫자부터 1씩 감소하다가 0이 되었을 때
// "종료" 메세지와 함께 프로그램이 종료되도록 만들어보자
// Threa 는 ThreadCount 에다 작성하기

public class Exam1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		
		ThreadCount tc = new ThreadCount(number);
		
		tc.start();
		
	}
}

class ThreadCount extends Thread {
	private int count;
	
	// 1. 생성자를 통해 전달한다.
	public ThreadCount(int count) {
		this.count = count;
	}
	
	// 2. setter 를 통해 받는다
	public void setCount(int count) {
		this.count = count;
	}
	
	// 2-1. 값을 반환 받고 싶으면 getter 를 만든다.
	public int getCount() {
		return count;
	}
	
	@Override
	public void run() {
		try {
			for(int i = count; i >=0 ; i--) {
				System.out.println(i);
				Thread.sleep(1000); // 3초 대기
			}
			System.out.println("종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
