package ex02_db;

import java.util.List;

public class EmpSelect {
   public static void main(String[] args) {
      
	  List<Emp> list = EmpMethod.find();
      
	  for(Emp e : list) {
		  System.out.printf("사번 : %d, 이름 : %s, 직무: %s, 급여: %d\n",e.getEmpno(),e.getEname(),e.getJob(),e.getSalary());
	  }
      
      
      
      
      
      
      
      
      
      
      
      
   
   }
}
