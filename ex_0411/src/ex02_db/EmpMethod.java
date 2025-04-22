package ex02_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {

	public static List<Emp> find() {
		List<Emp> list = new ArrayList<>();
		
		Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;
	    String sql = "SELECT empno, ename, job, sal from emp";
	      
	      try {
	         conn = DBUtil.getConnection();
	         stmt = conn.createStatement();
	         rs = stmt.executeQuery(sql);
	         
	         while(rs.next()) {
	            Emp e = new Emp();
	            e.setEmpno(rs.getInt("empno"));
	            e.setEname(rs.getString("ename"));
	            e.setJob(rs.getString("job"));
	            e.setSalary(rs.getInt("sal"));
	           
	            list.add(e);
	         }
	      } catch (Exception e) {
	         // TODO: handle exception
	      } finally {
	         try {
	            if(rs != null) {
	               rs.close();
	            }
	            
	            if(stmt != null) {
	               stmt.close();
	            }
	            
	            if(conn != null) {
	               conn.close();
	            }
	         } catch (Exception e2) {
	            // TODO: handle exception
	         }
	      }
	      
	      return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
