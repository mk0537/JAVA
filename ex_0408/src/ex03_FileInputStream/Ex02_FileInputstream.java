package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;

public class Ex02_FileInputstream {

	public static void main(String[] args) {
		// 경로를 저장
		String path = "D:\\full_stack_kmk\\JAVA\\test.txt";
		
		// File 객체에 경로 알려주기
		File f = new File(path);
		
		// byte 배열 생성
		// f.length()를 통해 내용 크기 만큼만 만든다. (공간 낭비X)
		byte[] b_read = new byte[(int)f.length()];
		
		
		FileInputStream fis = null;
		
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				// 파일에서 읽어온 내용을 바이트 배열에 담는다.
				// read() : 1바이트씩 읽어온다.
				// read(byte[] b) : 한 번에 읽어와서 배열에 담는다.
				fis.read(b_read);
				
				// 문자열 객체의 생성자에 바이트 배열을 전달함으로써
				// 문자열로 변환이 가능하다.
				String res = new String(b_read);
				
				System.out.println(res);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
