package ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {

	public static void main(String[] args) {
		// read() 와 write() 를 이용하여 복사하기
				FileInputStream fis = null;
				FileOutputStream fos = null;
				byte[] buffer = new byte[512];
				
				try {
					fis = new FileInputStream("D:\\full_stack_kmk\\JAVA\\wall.jpg");
					fos = new FileOutputStream("D:\\full_stack_kmk\\JAVA\\wall_copy.jpg");
				
					// 현재 시간을 m/s 단위로 나타냄
					long start = System.currentTimeMillis();
					System.out.println("이미지 읽기 시작");
					
					int read = 0;
					// read() 를 통해 읽는다.
					while((read = fis.read(buffer)) != -1) {
						// 읽어온 내용을 write() 로 쓴다.
						fos.write(buffer,0,read);
					}
					System.out.println("이미지 읽기 종료");
					long end = System.currentTimeMillis();
					// 종료시간 - 시작시작 = 총 소요시간
					double time = (double)(end - start)/1000; // 나누기 1000을 해야 초로 나옴
					
					System.out.println(time + "초");
					
					
				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					try {
						
						// 역순으로 닫아야 한다.
						if(fos != null) {
							fos.close();
						}
						
						if(fis != null) {
							fis.close();
						}
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				// 직접 복사하는 것보다 바이트 배열을 이용하여 이미지를 복사했을 때 
				// 속도가 매우 빠르다 
				
				
				
				
				
				

	}

}
