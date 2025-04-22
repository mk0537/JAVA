package ex01_Set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class Ex01_Set {

	public static void main(String[] args) {
		// Set은 객체의 저장 순서를 저장하지 않는다.
		// 수학의 집합과 유사한 개념을 지니고 있다.
		// 중복을 허용하지 않는다.
		// index를 부여하지 않기 때문에 데이터가
		// 입력된 순서대로 출력된다는 보장이 없다.
		
		// HashSet : Set 인터페이스에서 가장 많이 사용되는 클래스
		
		HashSet<String> hs1 = new HashSet<>();
		
		// add(E e) : 데이터에 추가
		hs1.add("apple");
		hs1.add("banana");
		hs1.add("orange");
		hs1.add("apple"); // 중복되는 데이터는 추가되지 않는다.
		
		System.out.println(hs1); // 입력 순서대로 출력되지는 않는다.
		
		hs1.add(null); // null 도 한 번 까지 저장 가능 
		
		System.out.println(hs1);
		
		
		/** HashSet이 중복되는 요소를 어떻게 체크할까? */
		// 1. hashcode() 로 같은 주소를 가지고 있는지 비교
		// 2. 해시값이 같으면 equals() 로 실제값을 비교
		// 	-> 둘 다 같으면 삭제
		
		
		// remove() : 삭제
		hs1.remove("apple");
		System.out.println(hs1);
		
		
		// size() : 들어 있는 요소의 개수
		System.out.println(hs1.size());
		
		
		// contains(Object o) : 요소가 포함되어 있는지 판별
		System.out.println(hs1.contains("banana"));
		
		
		
		/** hashSet 을 언제 쓰면 좋을까? */
		// 1. 중복되는 데이터가 없이 뽑을 때
		// 2. 순서나 정렬이 중요하지 않을 때
		
		
		
		// Hashset 객체를 이용하여 로또 번호 뽑기
		HashSet<Integer> hs2 = new HashSet<>();
		// 1 ~ 45 사이의 난수 6개 뽑기
		
		while (hs2.size() != 6) {  // 6개가 찰 때까지 반복
            // hs2.add(rd.nextInt(45) + 1); // 1~45 범위의 난수 생성
			int r = new Random().nextInt(45)+1;
			hs2.add(r);
        }
		
		// index 가 없기 때문에 하나만 고를 수가 없다.
		System.out.println("1 ~ 45 난수 생성 완료 ");
		System.out.println(hs2);
		
		
		/** 순서 생성하는 법 */
		// HashSet을 배열 형태로 변환
		
		// Object[] arr = hs2.toArray();
		// ㄴ 형변환이 필요하다. => 타입 안정성이 떨어짐 
		
		
		Integer[] arr = hs2.toArray(new Integer[0]);
		/** 왜 Integer[0]을 쓰는 걸까? */
		// 적절한 크기의 새 배열을 만들어서 반환을 해주기 때문이다.
		
		
		// arr 배열의 요소 꺼내기
		for(Integer x : arr) {
			System.out.print(x + ", ");
		}
		
		
		
		
	}

}
