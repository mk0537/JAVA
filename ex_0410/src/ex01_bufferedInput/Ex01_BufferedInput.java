package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex01_BufferedInput {

	public static void main(String[] args) {
		FileInputStream in = null;
		// 보조스트림의 선언
		BufferedInputStream  bis = null;
		
		try {
			in = new FileInputStream("D:\\full_stack_kmk\\JAVA\\test.txt");
			// 보조스트림은 생성자에 반드시 기반스트림 객체를 필요로 한다.
			bis = new BufferedInputStream(in);
			
			byte[] buffer = new byte[100];
			// 보조스트림이 단독으로 읽거나 쓰는 것을 불가능하다.
			
			// 기반스트림 객체로부터 위임을 받아서 읽거나 쓰는 것은 가능하다.
			
			int read = 0;
			
			read = bis.read(buffer);
			
			String text = new String(buffer);
			
			System.out.println(text);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 역순으로 닫아준다.
			// 보조스트림 닫기 -> 기반스트림 닫기
			try {
				if(bis != null) {
					bis.close();
				}
				
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
