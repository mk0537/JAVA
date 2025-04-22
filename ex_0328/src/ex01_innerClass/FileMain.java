package ex01_innerClass;

import java.util.List;

public class FileMain {
	public static void main(String[] args) {
		List<String> content = List.of(
				"첫 번째 줄",
				"두 번째 줄",
				"세 번째 줄"
		);
		
		// FileProcessor 클래스 타입의 'processor' 이라는 객체 생성
		FileProcessor processer = new FileProcessor();
		
		// FileProcessor 클래스 안에 있는 processFile 메서드 호출
		processer.processFile(content);
	}
}
