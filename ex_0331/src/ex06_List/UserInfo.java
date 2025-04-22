package ex06_List;

public class UserInfo {
	private String id;
	private int password;
	
	// 접근제한자가 private 인 멤버변수에는 어떻게 접근할까?
	
	// 1. setter & getter -> 객체 생성 후 메서드 호출 가능
	public void setId(String id) {
		this.id = id;
	}
	
	
	 public String getId() {
		return id;
	}
	 
	 
	 public void setPassword(String password) {
		this.password = password;
	}
	 
	 public int getPassword() {
		return password;
	
	 }
	 
	 // 2. 생성자를 통해서 받기
//	 public UserInfo(String id, int password) {
//		 this.id = id;
//		 this.password = password;
//	 }
}
