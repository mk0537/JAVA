package ex01_Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Student {
	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return String.format("[name : %s] score : %d", name, score);
	}
	
}


public class Exam1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// 짝수만 출력하기
		numbers.stream()
			.filter(t -> t % 2 == 0)
			.forEach(System.out::println);
		
		
		System.out.println("---------------------------");
		
		
		
		List<String> names = Arrays.asList("kim chulsoo", "lee younghee", "park minsue", "kim younghee", "choi gildong");
		// kim 으로 시작하는 이름만 골라서 대문자로 변환하고
		// 알파벳 순으로 정렬하여 출력하는 코드 작성하기
		
		names.stream()
			.filter(t -> t.startsWith("kim"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		
		System.out.println("---------------------------");
		
		
		
		List<String> num = Arrays.asList("1","2","3","4","5","6");
		// 짝수의 제곱값만 모아서 리스트로 변환하기
		List<Integer> event_num = num.stream()
									.map(Integer::parseInt) // 문자열로 된 숫자를 정수형으로 바꾸기
									.filter(t -> t % 2 == 0) // 짝수만 걸러내기
									.map(n -> n * n) // 제곱값 만들기
									.collect(Collectors.toList()); // 리스트로 변환하기
				
		System.out.println(event_num);
		
		
		System.out.println("---------------------------");
		
		
		
		// 점수가 가장 높은 학생의 이름 출력하기
	     List<Student> students = Arrays.asList(
	             new Student("Alice", 85),
	             new Student("Bob", 92),
	             new Student("Charlie", 78)
	         );
	      
	      
	     Stream<Student> stream = students.stream();
	     
	     
	     // ifPresent() : Optional 클래스에서 제공하는 매서드로 값이 존재할 경우에만
	     // 어떤 동작을 수행하고 싶을 때 사용하는 메서드
	     // Optional 안에 값이 잇으면 Consumer<T> 를 실행하고 값이 없으면 아무 일도 하지 않는다.
	     stream
	    		 .max(Comparator.comparing(Student::getScore))
	     			.ifPresent(t -> System.out.println(t.getName()));
	   
		// orElse 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
