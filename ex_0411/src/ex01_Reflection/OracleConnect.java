package ex01_Reflection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnect {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// jdbc : 자바 DB 연결
		// oracle : 오라클 DB를 의미
		// thin : 오라클에서 제공하는 경량 드라이버
		// localhost : DB 기본 주소(자기 컴퓨터)
		// 1521 : 기본 포트
		// xe : 오라클 SID
		
		
		String user = "hr"; // 아이디
		String password = "hr"; // 비밀번호
		Connection conn = null; // DB 연결
		Statement stmt = null; // 오라클로 전달하여 SQL 실행 
		ResultSet rs = null; // 실행 결과
		
		
		try {
			// conn : DB 연결을 생성
			conn = DriverManager.getConnection(url,user,password);
			
			// 문자열 형태의 SQL을 실제로 오라클로 전달해서 실행
			stmt = conn.createStatement();
			
			// executeQuery() : SQL을 실행한 결과를 ResultSet 타입으로 받는다.
			// select 된 결과들이 모두 rs에 담김
			rs = stmt.executeQuery("select * from emp");
			
			System.out.println("Oracle DB 연결 성공");
			
			
			// 조회된 데이터를 콘솔에 출력해보자.
			// next() : 다음에 읽어올 행이 있으면 true
			while(rs.next()) {
				System.out.println(rs.getInt("empno") + " / " + rs.getString("ename"));
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
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
