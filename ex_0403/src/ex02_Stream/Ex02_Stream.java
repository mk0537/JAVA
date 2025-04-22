package ex02_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02_Stream {

	public static void main(String[] args) {
		// 스트림의 중간 연산
		// 주의 : 중간연산으로 끝맺음 할 수 없음. 항상 최종 연산으로 마무리를 해야함
		
		// filter() : 조건에 맞는 요소만 걸러냄
		List<String> list = Arrays.asList("apple","banana","avocado");
		// a 로 시작하는 요소만 걸러내기
		list.stream()
			.filter(t -> t.startsWith("a"))
			.forEach(System.out::println);
			System.out.println("---------------------------");
		
		
		// map() : 각 요소를 변환
		list.stream()
			.map(t -> t.toUpperCase())
			.forEach(System.out::println);
			System.out.println("---------------------------");
		
		
		// distinct() : 중복 제거
		Stream.of("a","b","a","c")
			.distinct()
			.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		// sort() : 정렬
		Stream.of("banana","apple","cherry")
			.sorted()
			.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		// limit() : ~까지 자르기
		Stream.of(1,2,3,4,5)
			.limit(3)
			.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		// skip() : ~ 까지 건너뛰기
		Stream.of(1,2,3,4,5)
			.skip(2)
			.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		// peek() : 값을 그대로 유지하면서 중간에 볼 수 있게 해준다.
		// 중간 디버깅용
		Stream.of("one", "two", "three")
			.peek(t -> System.out.println("peek : " + t))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		System.out.println("---------------------------");
		
		
		
		
		

	}

}
