package ex02_break;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수를 생성하고
		// 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면 "맞춰야 할 숫자가 더 큽니다."
		// 적은 값이 난수보다 크면 "맞춰야 할 숫자가 더 작습니다."
		
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int random = r.nextInt(50)+1;
		
		int count = 0;
		
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			count++;
			if(num < random) {
				System.out.println("맞춰야 할 숫자가 더 큽니다.");
			} else if (num > random) {
				System.out.println("맞춰야 할 숫자가 더 작습니다.");
			} else if(num == random) {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println("시도 횟수 : " + count);
		
		
		
		
		
		
		
		
		
		
			
	}

}
