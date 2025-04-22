package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_ReadImage {

	public static void main(String[] args) {
		// byte 배열을 사용해서 이미지를 읽어왓을 때
		// 속도가 굉장히 빠르다는 것을 알 수 잇었다.
		
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("보조스트림으로 읽기");
			readFile = new FileInputStream("D:\\full_stack_kmk\\JAVA\\wall.jpg");
			
			// 버퍼라는 공간을 만들어주고 read() 를 통해서 읽어온 데이터를
			// 버퍼라는 공간에 저장을 해주고 버퍼가 다 차게 되면 내보낸다.
			bis = new BufferedInputStream(readFile);
			
			// 시작시간 측정
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			// 이미지를 읽는 속도를 측정하려는 용도. 읽기만 할 것
			while(bis.read() != -1) {

			}
			
			// 종료시간 측정
			long end = System.currentTimeMillis();
			
			// 소요시간 = 종료시간 - 시작시간
			double result = (double)(end - start) / 1000;
			
			System.out.println("소요시간 : " + result + "초");
			System.out.println("보조스트림으로 읽기 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				// 역순으로 닫기
				// 1. 보조스트림 부터 닫기
				if(bis != null) {
					bis.close();
				}
				
				// 2. 기반스트림 닫기
				if(readFile != null) {
					readFile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		

	}

}
