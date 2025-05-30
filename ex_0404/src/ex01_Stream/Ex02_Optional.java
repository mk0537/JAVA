package ex01_Stream;

import java.util.Optional;

public class Ex02_Optional {

	public static void main(String[] args) {
		// 스트림 최종결과를 Optional 로 반환하는 것들이 있었다.
		// 제네릭 클래스로 T타입의 객체를 감싸는 Wrapper 클래스이다.
		
		Optional<String> optStr = Optional.of("abcde");
		// optStr에 들어 있는 글자의 수를 반환하기
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr 배열 = "+ optStr.get());
		System.out.println("optStr 배열의 글자 수 = "+ optInt.get());
		
		// autoBox, unBoxf
		int result1 = Optional.of("123")
							.filter(x -> x.length() > 0)
							.map(Integer::parseInt)
							.get();
		System.out.println("result1 = " + result1);
		
		
		

	}

}
