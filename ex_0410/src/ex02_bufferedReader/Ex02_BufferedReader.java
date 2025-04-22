package ex02_bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02_BufferedReader {

	public static void main(String[] args) {
		// BufferedReader 를 이용해서 키보드에서 값을 입력 받는다.
		// 장점 : Scanner 보다 속도가 빠르다.
		BufferedReader reader = new BufferedReader(
										new InputStreamReader(System.in));
		
		// 키보드로부터 읽어옴
		try {
			System.out.print("문자열 입력 : ");
			String str = reader.readLine();
			
			// 정수 입력
			System.out.println("정수 입력 : ");
			int n = Integer.parseInt(reader.readLine());
			
			System.out.println("문자열 : " + str);
			System.out.println("정수 : " + n);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// 원칙대로라면 close() 를 통해 닫아줘야 하는데
		// System.in 은 닫으면 별로 좋지 않다.
		// 왜? static 이니까.
		// System.in 을 받아서 사용하는 다른 객체들이 못 쓰게 되어서. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
