package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {

	public static void main(String[] args) {
		// text.txt 파일을 만들고 한글, 영어(대소문자) 섞어서 작성
		// text.txt 파일의 내용을 읽어와서
		// 영어 대문자의 개수, 소문자의 개수를 판별하여 출력하세요
		// 결과
		// 대문자 : n개
		// 소문자 : n개
		
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\full_stack_kmk\\JAVA\\text.txt");
			
			int code;
			int upper = 0;
			int lower = 0;
			
			while((code = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				
				if (code >= 'a' && code <= 'z') {
					lower++;
				}
			}
			
			System.out.println("대문자 : " + upper + "개");
			System.out.println("소문자 : " + lower + "개");
			
			fr.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
