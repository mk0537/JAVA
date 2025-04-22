package ex02_Thread;

public class MainThread {

	public static void main(String[] args) {
		ThreadName tn = new ThreadName();
		tn.start();
		
		
		//여기서 알 수 있는 것 : main 도 하나의 스레드이다.
		System.out.println("현재 실행되고 있는 스레드의 이름 : " + Thread.currentThread().getName()); // main
		System.out.println("현재 실행되고 있는 스레드의 상태 : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위 : " + Thread.currentThread().getPriority());

	}

}
