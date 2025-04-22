package ex05_Generic;

public class DataListExample {

	public static void main(String[] args) {
		// 객체 생성과 동시에 배열도 생성됨
		// 클래스에 제네릭을 부여하게 되면 해당 클래스 타입의 객체를 선언할 때
		// 데이터 타입을 부여하게 된다.
		
		// 제네릭의 타입 변수는 기본자료형을 인식하지 않는다.
		// 따라서 int, double 등의 기본자료형을 제네릭 타입으로 이용하고자 한다면
		// Integer, Double 등의 클래스를 이용해야 한다.
		DataList<Integer> list = new DataList<>();

		// 배열의 타입이 Object 이므로 int, String, float 모두 가능
		// 단 값이 Object 타입으로 들어가게 됨 
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//list.add("문자열");
		//list.add(10.33);
		
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		
		

		
		
		for(int i = 0; i < list.size(); i++) {
			// 1. 조회
			Object data = list.get(i);
		
			// 2. 판별 : 저장된 데이터 타입이 어떤 타입인지 먼저 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + (int)data);
			} else if(data instanceof Double) {
				System.out.println("실수 : " + (double)data);
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
