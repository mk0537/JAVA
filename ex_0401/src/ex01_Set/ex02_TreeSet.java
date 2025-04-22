package ex01_Set;

import java.util.TreeSet;

public class ex02_TreeSet {
	public static void main(String[] args) {
		// 자바 컬렉션에서 제공하는 정렬된 Set
		// 중복을 허용하지는 않지만
		// Tree 기반이기 때문에 자동정렬이 된다.
		// Red-Black Tree 라는 자료구조를 기반으로 하고 있다.
		// Red-Black Tree 노드 보다 작으면 왼쪽, 크면 오른쪽
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(7); // 루트노드
		set1.add(4); // 7의 왼쪽
		set1.add(9); // 7의 오른쪽
		set1.add(1); // 4의 왼쪽
		set1.add(5); // 4의 오른쪽
		
		
		System.out.println(set1);
		System.out.println(set1.first()); // 최솟값
		System.out.println(set1.last()); // 최대값
		System.out.println(set1.higher(3)); // 위에서 3번째
		System.out.println(set1.lower(3)); // 밑에서 3번째
		
		
		
		
	}

}
