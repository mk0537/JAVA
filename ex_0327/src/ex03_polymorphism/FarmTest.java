package ex03_polymorphism;


	abstract class Animal {
		public abstract void cry(); // 추상 메서드
	}
	// 추상 클래스를 상속 받으면 반드시 추상 메서드를 오버라이딩 해야한다. (무조건)
	class Pig extends Animal { 
		@Override
		public void cry() { // 부모 클래스의 추상 메서드 오버라이딩
			System.out.println("꿀꿀");
		}
	}
	
	class Cow extends Animal {
		@Override
		public void cry() {
			System.out.println("음메");
		}
	}
	
	class Farm {
		public void sound(Animal animal) {
			if(animal instanceof Pig ) {
				System.out.println("꿀꿀");
			} else {
				System.out.println("음메");
			}
		}

	public class FarmTest {
		public static void main(String[] args) {
			Farm f = new Farm();
			Pig p = new Pig();
			Cow c = new Cow();
			f.sound(p);
			f.sound(c);
		}
	}
		
	
	
	
	
	
}
public class FarmTest {
	
}
