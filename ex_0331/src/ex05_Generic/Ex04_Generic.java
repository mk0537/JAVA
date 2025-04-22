package ex05_Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_Generic {
	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>(Arrays.asList(1,2,3));
		List<String> stringList = Arrays.asList("A","B","C");
		
		print(lists);
		//print(stringList);
		
	}
	
	
	// <?> : 와일드 카드의 경우는 메서드의 매개변수의 타입으로 사용하는 것이 일반적이다.
	
	// <?> -> 제네릭에 들어 오는 모든 타입을 허용한다.
//	public static void print(List<?> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//	}
	
	// <? extends Number> -> Number와 그 자식클래스 까지만 허용한다.
//	public static void print(List<? extends Number> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//	}
	
	// <? super Integer> -> Integer를 포함한 부모 타입 까지만 허용한다.
//	public static void print(List<? super Integer> list) {
//		for(Object e : list) {
//			System.out.println(e);
//		}
//	}
	
	
	public static void print(List<? extends Number> list) {
		for(Object e : list) {
			System.out.println(e);
		}
	}

}
