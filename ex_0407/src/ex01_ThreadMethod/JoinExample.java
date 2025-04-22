package ex01_ThreadMethod;

public class JoinExample extends Thread{
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("작업 스레드 : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		System.out.println("시스템 종료");
	}
}
