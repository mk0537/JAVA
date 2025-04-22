package ex06_List;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 아래의 결과를 도출하시오
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc3
		// abc abc2 abc3
		// 아이디 생성 :
		
		Scanner sc = new Scanner(System.in);
//		ArrayList<String> list = new ArrayList<>();
//		
//		
//		for(int i = 0; i <= 4; i++) {
//			System.out.print("아이디 생성 : ");
//			String id = sc.next();
//			list.add(id);
//			System.out.println(list);
//		}
		
		
		// 아래의 결과를 도출하시오
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc
		// 중복된 아이디
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : c
		// abc abc2 c
				
		ArrayList<String> list = new ArrayList<>();
		String id2;
				
				out:while(true) {
					System.out.print("아이디 생성 : ");
					String id = sc.next();
					
					for(String x :list) {
						if(list.contains(id)) {
							System.out.println("중복된 아이디");
							continue out;
						}
					}
					list.add(id);
					
					
					for(String x : list) {
						System.out.print(x + " ");
					}
	
					System.out.println();
					if(list.size() == 5) {
						break;
					}
			}
			
				
				
				
				
		
		
		
	}
	
}
