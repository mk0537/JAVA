package ex06_Annotation;

import java.util.ArrayList;
import java.util.List;

// 추상 메서드가 무조건 1개는 있어야 하는 @FunctionalInterface
@FunctionalInterface
interface testInter {
	void method1();
}

class testImpl implements testInter {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
}


// '사용하지 않는 변수' 경고를 억제
@SuppressWarnings({"unused", "unchecked", "deprecation"})
// unused : 사용하지 않는 변수에 대한 경고 억제
// unchecked : 제네릭 타입 미지정에 발생하는 경고 억제 (List list = new ArrayList(); -> 경고)
public class Ex01_Annotation {
	public static void main(String[] args) {
		int x = 10;
		
		List<String> list = new ArrayList();
		
		Integer y = new Integer(10);
		
		addUser("철수");
	}
	
	@Deprecated // 취소선 발생
	public static void addUser(String name) {
		System.out.println("사용자 추가 : " + name + "(이 방식은 더이상 권장되지 않습니다.)");
	}
	
}
