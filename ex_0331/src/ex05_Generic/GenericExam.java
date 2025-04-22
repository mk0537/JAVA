package ex05_Generic;

// 제네릭 클래스를 정의 (T를 클래스 수준에서 사용)
class Gen<T> {
    // 클래스의 제네릭 타입 T를 그대로 사용
    public void printArr(T[] arr) {
        for (T x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
    
public class GenericExam {
    public static void main(String[] args) {
        // Integer, Double, Character 배열 생성
        Integer[] iArr = {1, 2, 3, 4, 5};
        Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] cArr = {'A', 'B', 'C', 'D', 'E'};

        Gen g1 = new Gen();

        // 컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다.
        g1.printArr(iArr);
        g1.printArr(dArr);
        g1.printArr(cArr);
    }
}
