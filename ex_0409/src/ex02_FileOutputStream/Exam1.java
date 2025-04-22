package ex02_FileOutputStream;

import java.io.FileOutputStream;
import java.util.Scanner;

// 학생의 이름과 점수를 저장하는 프로그램
// 이름과 점수를 FileOutputStream을 이용하여 scores.txt 파일에 저장하세요

// 요구사항
// 1. 사용자로부터 이름과 점수를 입력받는다. (Scanner)
// 2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다. ex) "김철수 : 84"
// 3. 이름에 exit를 입력하면 프로그램 종료
// 4. 파일은 score.txt 로 저장되며 기존 내용은 덮어쓴다.
// "이름 : 점수 \n" 형식의 문자열에 각 문자의 char 값을 +3을 해 암호화한다.

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력:");
        String name = sc.next();

        if (name.equals("exit")) {
            System.out.println("프로그램 종료");
            sc.close();
            System.exit(0);
        }

        System.out.println("점수 입력:");
        String score = sc.next(); 
        
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("D:\\full_stack_kmk\\JAVA\\scores.txt", true);

            String msg = name + " : " + score + "\n";
            

            fos.write(msg.getBytes());
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
