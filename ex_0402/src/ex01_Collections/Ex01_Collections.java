package ex01_Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01_Collections {

	public static void main(String[] args) {
		// Collections : Java 에서 컬렉션을 다룰 때 유용한 기능들을 제공하는 클래스
		// JAva.utill.Collections 패키지에 포함되어 있으며
		// 모든 메서드는 정적 메서드이다.
		
		List<Integer> numbers = Arrays.asList(4,2,9,3,6,7,1,8);
		
		System.out.println("정렬 전 : " + numbers);
		System.out.println();
		
		
		/** sort() : 리스트의 요소를 오름차순으로 정렬 */
		Collections.sort(numbers);
		System.out.println("정렬 후 : " + numbers);

		
		/** reverse() : 리스트 요소의 순서를 내림차순으로 정렬 */
		Collections.reverse(numbers);
		System.out.println("내림차순 정렬 후 : " + numbers);
		
		
		/** shuffle() : 리스트 요소를 무작위로 섞음 */
		Collections.shuffle(numbers);
		System.out.println("정렬 후 : " + numbers);
		
		
		/** min(Collection c) : 컬렉션에서 최소값을 찾는다 */
		int min = Collections.min(numbers);
		System.out.println("최소값 : " + min);
		
		
		/** max(Collection c) : 컬렉션에서 최대값을 찾는다 */
		int max = Collections.max(numbers);
		System.out.println("최대값 : " + max);
		
		// Set 이나 Map 은 List 로 변환한 다음 사용해야 한다.
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
