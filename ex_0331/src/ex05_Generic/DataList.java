package ex05_Generic;

	
	// 이 클래스는 데이터를 저장할 수 있는 자료구조
	// 배열의 타입은 Object이다.
	// Object는 모든 클래스의 최상위 클래스이므로 어떠한 데이터 형태라도 저장이 가능하다.
	// 하지만 데이터를 저장한 후 실제로 꺼내서 사용하려면 어떤 데이터 타입을
	// 지녔는지 일일히 확인해야 하고, 약속한 데이터가 입력되지 않아 에러가 발생할 수 있다.



public class DataList<T> {
	private T[] data;
	private int size;
	private int defaultSize = 10;
	
	// 생성자
	public DataList() {
		// Object 타입의 data 배열에 defaultSize 만큼의 배열 크기 설정
		data = (T[]) new Object[defaultSize];
	}
	
	
	// 생성자 오버로딩
	public void DataList(int size) {
		// Object 타입의 data 배열에 매개변수 size 크기 만큼의 배열 크기 설정
		data = (T[]) new Object[size];
	}
	
	
	// 배열에 데이터를 추가해주는 메서드
	public void add(T value) {
		// 위에 있는 size 매개변수랑 다른 거임
		data[size++] = value;
	}


	// 배열에 데이터를 조회하는 메서드
	public T get(int index) {
		return data[index];
	}
	
	
	// 배열의 크기를 반환하는 메서드
	public int size() {
		return size;
	}
	

	
	
}
