package ex02_lamda;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex03_Function {
	public static void main(String[] args) {
		// 컬렉션 프레임워크의 인터페이스의 일부는 함수형 인터페이스를 사용한다.
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		list.add("이름5");
		list.add("이름6");
		
		// void accept(T t);
		
		// ArrayList 'list' 에 들어 있는 요소를 하나씩 꺼내어 출력하라
		// list.forEach(x -> System.out.println(x));
		/** ::(이중콜론) : 메서드 참조 연산자 */
		list.forEach(System.out::println); // 위 식과 동일한 거임
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		hs.forEach(System.out::println);
		
		
		
		
	}

}
