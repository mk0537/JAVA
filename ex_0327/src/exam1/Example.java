package exam1;

class A{
    
	public A(){System.out.println("A");} // super();
    
    public A(int x){
    	System.out.println("A: " + x);
    }
}

class B extends A{
    public B(){
    	super(100);
    }
    public B(int x){ // 여기가 실행됨
    	// super(); 가 생략 되어 있음
    	System.out.println("B: "+x);
    }
}

public class Example{
    public static void main(String[] args){
        B b = new B(11);
    }
}


// 출력 결과를 예상하여 작성하시오.
// A -> A를 상속 받고 있기 때문에 public A(){System.out.println("A");}도 실행 (super();) 실행)
// B: 11
