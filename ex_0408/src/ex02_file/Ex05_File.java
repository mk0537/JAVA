package ex02_file;

import java.io.File;

public class Ex05_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_kmk\\JAVA\\aaa\\bbb";
		
		File f = new File(path);
		
		if(f.exists()) {
			if(f.isDirectory()) {
				// delete() : 파일 & 폴더 삭제
				// 폴더는 비어 있어야 삭제할 수 있다.
				if(f.delete()) {
					System.out.println("디렉토리가 삭제되었습니다.");
				} else {
					System.out.println("디렉토리 삭제 실패(디렉토리가 비어있는지 확인)");
				}
			} else {
				System.out.println("이 경로는 디렉토리가 아닙니다.");
			}
		} else {
			System.out.println("삭제할 디렉토리가 존재하지 않습니다.");
		}
		
		// 폴더는 생성되지만 파일을 만들거나
		// 파일을 읽는 것은 불가능하다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
