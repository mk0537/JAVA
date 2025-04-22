package ex06_List;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		// ArrayList<String> list = new ArrayList<>();: 같은 거임
		List<String> list = new ArrayList<>();

		// 데이터 삽입
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		// 리스트의 출력
		// 변수명으로 출력했을 때 주소가 아닌 내용이 나온다.
		System.out.println("리스트 내용1 : " + list);
		
		
		// 리스트의 3번째 위치에 요소 삽입합기
		list.add(2,"수박");
		System.out.println("리스트 내용2 : " + list);
		
		
		// 데이터의 변환
		list.set(0, "사과");
		list.set(1, "키위");
		System.out.println("리스트 내용3 : " + list);
		
		
		// 데이터의 삭제
		// remove(int index) -> 삭제를 하고, 삭제한 value를 반환
		System.out.println(list.remove(3)); // 망고 삭제
		System.out.println("리스트 내용4 : " + list);
		
		
		// 리스트에서 데이터 가져오기
		System.out.println(list.get(1)); // 키위
		
		
		// 리스트에 들어 있는 모든 내용 출력하기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 배열의 길이 -> .length()
		// 리스트의 길이 -> .size()
		
		
		// 향상된 for문을 이용해 출력할 수 있다.
		for(String x : list) {
			System.out.println("값 : " + x);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
