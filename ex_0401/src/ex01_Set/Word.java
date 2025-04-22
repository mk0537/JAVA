package ex01_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// 사용자가 입력한 문자에서 단어가 중복되었는지 검사하기
		// 예시
		// I love JAVA and I love cording
		// 중복 단어 있음
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		// words 라는 문자열 배열에 " "(띄어쓰기)를 기준으로 잘라서 집어 넣음
		String[] words = input.split(" ");
		
		HashSet<String> wordSet = new HashSet<>();
		
		boolean hasDuplicate = false;
		
		// boolean add(E e)
		// 잘 들어갔으면 true, 중복되면 false 를 반환
		for(String word : words) {
			if(!wordSet.add(word)) {
				hasDuplicate = true;
				break;
			}
		}
		if(hasDuplicate) {
			System.out.println("중복 단어 있음!");
		} else {
			System.out.println("중복 단어 없음!");
		}

	}

}
