package exam1;

public class Book extends Exception{
	private String bookName;
	private String writer;
	
	public Book(String bookName, String writer) {
		this.bookName = bookName;
		this.writer = writer;
	}
	
	@Override
	public String toString() {
		String str = "책 이름 : " + bookName + ", 저자 : " + writer;
		return str;
	}
	
	
}
