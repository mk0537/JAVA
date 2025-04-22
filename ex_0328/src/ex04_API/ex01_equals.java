package ex04_API;

public class ex01_equals {

	public static void main(String[] args) {
		// 문자열 리터럴
		// 같은 문자열일 때 이미 메모리에 올라가 있으면 참조를 해버린다.
		String str1 = "Hello";
		String str2 = "Hello";
		
		// 생성자를 통한 생성
		String str3 = new String("Hello");
		
		// 주소의 비교
		System.out.println("str1 vs str2 : "+ (str1 == str2)); // true
		System.out.println("str1 vs str3 : "+ (str1 == str3)); // false
		System.out.println("str2 vs str3 : "+ (str2 == str3)); // false
		
		System.out.println("str1 hashcode : " + System.identityHashCode(str1)); //122883338
		System.out.println("str2 hashcode : " + System.identityHashCode(str2)); //122883338
		System.out.println("str3 hashcode : " + System.identityHashCode(str3)); //666641942
		
		// 실제 값에 대한 비교
		// 들어 있는 내용이 같으면 true
		System.out.println("str1 vs str2 : " + str1.equals(str2)); //true
		System.out.println("str2 vs str3 : " + str2.equals(str3)); //true
		
		
		// 얕은 복사 (shallow copy)
		// 주소를 복사해주기 때문에 원본값이 바뀌면 복사본도 바뀐다.
		str1 ="bye";
		System.out.println(str2); // 왜 안바뀜?;;
		
		// 문자열의 불변(immutable) -> 문자열의 값은 바뀌지 않는다.
		// 문자열을 수정하려고 할 때마다 메모리에 항상 새로운 문자열 객체가 생성된다  
		
		
		
		
		
	}

}
