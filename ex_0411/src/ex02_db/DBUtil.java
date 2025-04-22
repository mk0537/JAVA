package ex02_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB 연결 전담 클래스
public class DBUtil {
	// 이러한 DB 정보들은 최대한 노출을 안하는 것이 좋기 때문에
	// private static final 설정
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	private static final String user = "hr"; // 아이디
	private static final String password = "hr"; // 비밀번호
	
	// getConnection() 메서드를 호출하면 db 와 연결할 수 있는
	// conn 객체를 얻을 수 있다.
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
