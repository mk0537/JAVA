package ex03_FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		// file.txt 를 만들고 
		// 문장을 입력하고 저장한다.
		// FileInputStream 으로 읽어온 뒤, 회문인지 아닌지 검증하세요
		String path = "D:\\full_stack_kmk\\JAVA\\file.txt";
		
		File f = new File(path);
		
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(b_read);
				
				String res = new String(b_read);
				
				System.out.println(res);
				
				
			} catch (IOException e) {
				e.printStackTrace();
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
