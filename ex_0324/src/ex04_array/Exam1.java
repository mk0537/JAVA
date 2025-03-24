package ex04_array;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		int[] iArr = new int[10];
		// 배열의 각각의 인덱스에 1 ~ 10을 할당하고
		// 총 합을 구하여 출력하세요
		
		int sum = 0;
		for(int i = 0;i < iArr.length; i++) {
			iArr[i] = i + 1;
			sum += iArr[i];
		}
		System.out.println("총합 : " + sum);
		
		
		System.out.println("------------------------------------");
		
		
		Random r = new Random();
		
		int total = 0;
		// iArr에 각 index에 난수를 넣고 배열의 짝수 요소들의 총합 구하기
		for(int i = 0;i < iArr.length; i++) {
			iArr[i] = r.nextInt(30+1);
			if(iArr[i] % 2 == 0) {
				total += iArr[i];
			}
		}
		System.out.println("짝수들의 총합 : " + total);
		
		
		System.out.println("------------------------------------");
		
		
		int[] nums = {5,7,2,9,4,10,3};
		// 배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		
		int max = iArr[0];
		int min = iArr[0];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}

		}
		System.out.println("최소값 : " + min + ", 최대값 : " + max );
		
		
		System.out.println("------------------------------------");
		
		
		int[] nums2 = {1,2,1,3,2,1,4};
		// 위 배열엣 ㅓ 각 숫자가 몇 번 나왔는지 출력하시오
		// 1 : 3번
		// 2 : 2번
		// 3 : 1번
		// 4 : 1번
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == 1) {
				one++;
			} else if (nums2[i] == 2) {
				two++;
			} else if (nums2[i] == 3) {
				three++;
			} else if (nums2[i] == 4) {
				four++;
			} 
		}
		System.out.println("1 : " + one + "번");
		System.out.println("2 : " + two + "번");
		System.out.println("3 : " + three + "번");
		System.out.println("4 : " + four + "번");
		
		
		System.out.println("------------------------------------");
		
		
		
		int[] nums3 = {5,3,8,4,2};
		// 오름차순으로 정렬하세요
		
		 // 1. 버블정렬
		 // 인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬 방식
		 for(int i = 0; i<nums3.length-1; i++) {
				for(int j = 0; j<nums3.length-1 -i; j++) { 
					if(nums3[j] > nums3[j+1]) {
					int temp = nums3[j];
					nums3[j] = nums3[j+i];
					nums3[j+1] =temp;
				}
			}
		}
		
		
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'};
		String myWord = "";
		
		// 배열에서 영문자만 추출하여 이어 붙여 출력하세요
		for(int i = 0; i < cards.length; i++) {
			if (cards[i] >= 65) {
				myWord += cards[i];
			}
		}
		System.out.println(myWord);
		
		
		System.out.println("------------------------------------");
		
		
		// 키보드에서 배열의 길이를 입력 받는다.
		// 입력 받은 배열의 길이 만큼 알파벳을 넣고 출력한다.
		
		// 배열의 길이 : 5
		// ABCD
		// 배열의 길이 : 3 
		// ABC
		
		Scanner sc = new Scanner(System.in);
        
        System.out.print("배열의 길이 : ");
        int n = sc.nextInt(); // 배열 크기 입력 받기
        
        int[] arr2 = new int[n]; // 입력받은 크기로 배열 생성
        
        // 알파벳 A부터 채우기
        for (int i = 0; i < n; i++) {
            arr2[i] = 65 + i; // 65 = 'A'의 ASCII 값
        }

        // 배열 출력 (문자로 변환)
        for (int i = 0; i < n; i++) {
            System.out.println((char) arr2[i] + " ");
        }
		
        
        
        System.out.println("------------------------------------");
        
        
        
		
		// 동전의 갯수 구하기
        // 10 ~ 5000 사이의 난수를 변수에 담는다.
        // 1의 자리는 반드시 0이 되도록 한다.
        // 발생된 난수를 각 동전으로 바꿀 때 몇 개씩 필요한지 판단하여 작성하세요
        // 가능한 적은 수의 동전을 사용한다.
        
        // 4170
        // 500원 :8개
        // 100원 :1개
        // 50원 : 1개
        // 10원 : 2개
        
        int[] coin = {500,100,50,10};
        int money = r.nextInt(5000)+1;
        money *= 10; // 무조건 1의 자리는 0
        
        System.out.println("금액 : " + money);

		for (int i = 0; i < coin.length; i++) {
			int res = money / coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], res);
			money %= coin[i];
			}
			
			
			
		
		
		
		
		
		
		
		
		
		// 배열 뒤집어 주기
//		 int n = arr.length;
//		 for (int i = 0; i < n / 2; i++) {
//		     int temp = array[i];
//		     array[i] = array[n - 1 - i];
//		     array[n - 1 - i] = temp;
//		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
