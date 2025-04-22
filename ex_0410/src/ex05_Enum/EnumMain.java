package ex05_Enum;

import java.util.Arrays;

public class EnumMain {

	public static void main(String[] args) {
		// 모든 열거형이 상속하는 Enum 클래스에 toString() 메서드에서
		// 이름을 반환하기 때문에 이름이 출력된다.
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items)); //Arrays 클래스 import
	    
		
		System.out.println("--------------------------------");
		
		
		
		//열거형 순서 반환해보기
			for(Item item : items) {
				System.out.println("name="+item.name()+",ordinal = "+item.ordinal());
			}
	   
			
		System.out.println("--------------------------------");
			
		
		Item i1 = Item.START;
		System.out.println(i1);
		   
			
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
	    
	    
		System.out.println(i1 == i2); // true
	    
		
		
		System.out.println("--------------------------------");
		
		
	    
	    Item i3 = Item.EXIT;
	    
	    // 열거형끼리는 == 빼고는 비교연산 사용 불가
	    // compareTo() 는 사용이 가능하다.
	    // System.out.println(i1 > i3); (X)
	    
	    System.out.println(i1.compareTo(i3)); // -2
	    // a.compareTo(b)
	    // a가 b보다 앞서면 -> 음수
	    // a와 b가 같으면 -> 0
	    // a가 b보다 뒤면 -> 양수
	    
	    
	    System.out.println("--------------------------------");
	    
	    
	    
	    // 열거형과 switch 문
	    // 열거형 상수를 switch 의 case 에 쓸 수 있다.
	    
	    switch(i1) {
	    case START: // Item.START 앞의 타입은 생략해도 된다.
	    	System.out.println("시작");
	    	break;
	    case STOP:
	    	System.out.println("정지");
	    	break;
	    case EXIT:
	    	System.out.println("종료");
	    	break;
	    }
	    
	    
	    
	    System.out.println("--------------------------------");
	    
	    
	    
	    
	    for(Item item : items) {
	    	System.out.println(item.getItemStr() + " "+ item.getSymbol());
	    }
			
	    
	    // 왜 enum 을 써야할까?
	    
	    // 1. 코드의 가독성을 증가시킬 수 있다.
	    // 	ㄴ ex) int status = 1 -> 무슨 상태인지 모를 수 있음
	    // 			그러나 Status status = Status.SUCCESS; -> 누가봐도 성공 상태
	    
	    // 2. 타입 안정성 보장
	    // 정해진 값 이외에 다른 값을 넣을 수 없다.
	    // 	ㄴ ex) 열거형을 안 쓸 때 
	    // 		int color = 999999; 
	    // 		문법적으로 틀린 건 아니라 에러는 안 나지만 우리가 설정한 색의 범주가 아님		
	    // 그러나 Color color = Color.RED; // 색의 범주가 정해져 있는 Color 타입만 들어올 수 있다.
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    
    
	}

}
