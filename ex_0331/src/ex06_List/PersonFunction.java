package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction{
	

	public void personFunc() {
		ArrayList<Person2> personArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
			
		int select;
		Person2 p;
		
		
		while(true) {
			System.out.println("결과 :");
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.println("3. 전체정보");
			System.out.print("항목 선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				// 정보 추가
				p = new Person2();
				System.out.println("-------- 정보 추가 ---------");
				System.out.print("이름 :");
				p.setName(sc.next());
				System.out.print("나이 :");
				p.setAge(sc.nextInt());
				System.out.print("전화 :");
				p.setPhone(sc.next());
				System.out.println("정보가 저장되었습니다.");
				System.out.println("--------------------------");
				break;
			case 2:
				// 정보 삭제
				System.out.println("-------- 정보 삭제 ---------");
				System.out.print("삭제할 이름 :");
				String name = sc.next();
				for(int i = 0; i < personArr.size(); i++) {
					// personArr 요소의 이름을 꺼내서 입력받은 name과 이름이 같으면
					if(personArr.get(i).getName().equals(name)) {
						personArr.remove(i);
						System.out.println(name + "의 정보를 삭제했습니다.");
						break;
					} else {
						// for문을 돌다가 마지막에 들어올 수 있게 하는 조건
						if(i + 1 == personArr.size()) {
						System.out.println(name + "이 존재하지 않습니다.");
						}
					}
					System.out.println("--------------------------");
				}
				break;
			case 3:
				// 전체 정보
				System.out.println("-------- 전체 정보 ---------");
				System.out.println("등록인원" + personArr.size()+"명");
				for(Person2 x : personArr) {
					System.out.println("이름 : "+ x.getName());
					System.out.println("나이 : "+ x.getAge());
					System.out.println("전화 : "+ x.getPhone());
					System.out.println("--------------------------");
				}
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			}
		}
		
		

	}

}
	
	
	

