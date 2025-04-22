package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain extends UserInfo{
	
	public static void main(String[] args) {
		// ArrayList를 UserInfo 타입으로 생성하기
		ArrayList<UserInfo> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("아이디 생성");
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			System.out.print("패스워드 생성");
			ui.setPassword(sc.next());
			
			list.add(ui.getId(), ui.getPassword());
			
			for(String x : list) {
				System.out.println(x + "----------------------------");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
