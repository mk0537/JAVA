package ex01_multi_array;

public class Ex01_Array {

	public static void main(String[] args) {
		int [][] arr = new int[2][3];
		// 2차원 배열의 요소는 2개
		// 2차원 배열에 들어가는 1차원 배열의 요소는 3개
		
		// 1) 배열선언
		int[] ar;

		// 2) 배열생성
		//배열의 index수의 갯수는 처음 지정해둔 갯수에서 강제로 늘리거나 줄일 수 없다.
		//스택과 힙에 대한 설명  기본자료형 변수와 데이터는 스택에 만들어진다.
		//클래스 구조와 배열구조는 스택에 일단 만들어진다. new 라는 키워드를 통해서 힙 메모리 영역에 집을 지어주는 키워드이다.
		ar = new int[4];

		//생성 후에는 값을 넣어 초기화가 필요하다.
		//아무런 값도 넣지않으면 기본자료형은 각 자료형의 초기값,
		//스트링형은 null이 들어간다.
		//int[] ar = {100, 200, 300, 400};//초기화 방법1

		// 3) 초기화 방법2
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		
		
		
		//배열의 출력		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;
		
		//행의 주소 출력
		System.out.println("2차원 배열 : " + arr);
		
		//1행이 가진 열에 대한 주소 출력
		System.out.println("2차원 배열 1행 : " + arr[0]);
		
		//행의 크기 출력
		System.out.println("행의 크기 : " + arr.length);
		
		//각 행의 열 크기 출력
		System.out.println("1 행의 열 크기 : " + arr[0].length);
		System.out.println("2 행의 열 크기 : " + arr[1].length);
		
		//1행 1열의 값 출력
		System.out.println("arr[0][0] : " + arr[0][0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
