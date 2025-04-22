package ex01_Thread;


class AddStackThread extends Thread {
	private Storage storage;
	
	// 생성자
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		// 짐을 10개씩 쌓는다
		try {
			while(true) {
				Thread.sleep(1000);
				if(this.storage.getStackCount() == 0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10); // 짐 10개 추가
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
} // AddStackThread 끝



class PopStackThread extends Thread{
	private Storage storage;
	
	// 생성자
	public PopStackThread(Storage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		// 짐을 5개씩 나른다
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("짐 5개 나르기");
				this.storage.popStack(5); // 짐 5개 나르기
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
} // PopStackThread 끝


public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
		
		
	}
}
