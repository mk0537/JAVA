package ex02_db;

import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		PersonMethod.add(4,"john",50);
		
		List<Person> list = PersonMethod.find();
	      
		  for(Person p : list) {
			  System.out.printf("id : %d, 이름 : %s, 나이 : %d\n", p.getIdx(),p.getName(), p.getAge() );
		  }
		
	}

}
