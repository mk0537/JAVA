package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85


public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
        
        
		System.out.println("이름 입력:");
        String name = sc.next();

        if (name.equals("exit")) {
            System.out.println("프로그램 종료");
            sc.close();
            System.exit(0);
        }

        System.out.println("점수 입력:");
        String score = sc.next(); 
       
        
        try {
            fos = new FileOutputStream("D:\\full_stack_kmk\\JAVA\\scores.txt", true);

            String msg = name + " : " + score + "\n";
            

            fos.write(msg.getBytes());
            System.out.println("파일 생성 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				File f = new File("D:\\full_stack_kmk\\JAVA\\scores.txt");
		        FileInputStream fis = null;
		        byte[] read = new byte[(int)f.length()];
		        
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}
        
        
        // 복호화해서 콘솔에 출력하기
        File f = new File("D:\\full_stack_kmk\\JAVA\\scores.txt");
        FileInputStream fis = null;
        byte[] buffur = new byte[(int)f.length()];
        try {
			fis = new FileInputStream(f);
			fis.read(buffur);
			String s = new String(buffur);
			String result = "";
			for(int i = 0; i < s.length(); i++) {
				result += (char)(s.charAt(i)-3);
			}
			System.out.println("복호화 결과");
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				
			}
		}

        
        
        
        
        
        
        
        

	}

}
