package ex04_overloading;

public class Bread {
	
	// 메서드1
	public void makeBread(){
		System.out.println("빵을 만들었습니다.");
		System.out.println("--------------------------");
	}
	
	// 메서드2
	public void makeBread(int n){
		for(int i = 1; i <= n ; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다. \n", n);
		System.out.println("--------------------------");
	}
		
		
	// 메서드3
	public void makeBread(String s, int n){
		for(int i = 1; i <= n ; i++) {
			System.out.printf("%s빵을 만들었습니다. \n", s);
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다. \n", n);
		System.out.println("--------------------------");
	}
}
