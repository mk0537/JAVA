package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam01 {

	public static void main(String[] args) {
			// 예제
			// 각 사용자는 여러 상품을 주문할 수 있으며 
			// 주문 내역은 ArrayList 에 문자열 형태로 저장이 되고
			// "사용자이름:상품이름" 형태로 저장이 된다.
			// 가장 많이 주문된 상품 이름과 주문 수량을 출력하세요
					
			// 결과 Phone => 4
		
			List<String> orders = Arrays.asList(
				"Alice:TV", "Bob:TV", "Alice:Phone", "Charlie:TV",
				"David:Tablet", "Eve:Phone", "Frank:Phone", "Alice:Phone"
			);
				
			HashMap<String, Integer> productCount = new HashMap<>();

	        // 모든 주문을 반복하면서 상품별 개수 증가
	        for (String order : orders) {
	            String productName = order.split(":")[1]; // 상품명 추출
	            productCount.put(productName, productCount.getOrDefault(productName, 0) + 1);
	        }
	        
	        // 최다 주문 상품 찾기
	        String max = null;
	        int maxOrders = 0;

	        for (Map.Entry<String, Integer> entry : productCount.entrySet()) {
	            if (entry.getValue() > maxOrders) {
	                max = entry.getKey();
	                maxOrders = entry.getValue();
	            }
	        }
	        

	        System.out.println("결과 " + max + " => " + maxOrders);

			
	}

}
