package ex06_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 메타 어노테이션
// 사용자 정의 어노테이션을 만들기 위한 어노테이션
// @Target : 어노테이션이 적용될 수 있는 위치(필드, 메서드, 클래스 등)
// @Retention :  어노테이션의 유지 범위를 지정(런타임, 컴파일 등)
// @Documented : Javadoc 문서에 어노테이션 정보 포함 여부
// @Inherited : 자식 클래스에게 상속될 수 있는 어노테이션 여부


// 선언 키워드는 @interface
// 어노테이션을 적용할 타겟
@Target(ElementType.TYPE)
// 어노테이션이 적용될 시간
@Retention(RetentionPolicy.RUNTIME)

public @interface TestInfo {
	// 속성 정의
	String name();
	int career() default 1;
	String[] skills();
	
	
	
	// 1. 어노테이션의 속성은 메서드 형태로 정의한다.

	// 2. 어노테이션 속성의 반환형은 제한적이다.
	// 기본타입
	// String
	// Class
	// enum
	// 다른 어노테이션
	// 배열
	
	// 3. 속성에 기본값을 지정할 수 있다.
	// 4. 예외를 던질 수 없다.
	// String value() throw Exception; (X)
	
	// 5. 속성은 매개변수를 가질 수 없다.
	// String name(String input); (X)
	
	String value() default "홍길동"; // 추상메서드로 선언해야 한다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
