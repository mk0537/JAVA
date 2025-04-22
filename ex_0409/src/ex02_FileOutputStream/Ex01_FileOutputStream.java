package ex02_FileOutputStream;

import java.io.FileOutputStream;

public class Ex01_FileOutputStream {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		
		try {
			// 경로에 파일이 없으면 파일을 만들어준다.
			// write 를 한 내용까지 작성을 해준다.
			// 세이브 파일을 만든다거나 저장하는 문서를 만드는 경우 FileOutputStream 이 사용된다.
			fos = new FileOutputStream("D:\\full_stack_kmk\\JAVA\\fileOut.txt");
			
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
			
			String msg = "fileOutpuy 예제입니다. \n";
			String msg2 = "여러줄도 가능 \n";
			String msg3 = """
							여러줄
							문자열
							리터럴
							""";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			
			
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
