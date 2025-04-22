package ex05_Enum;

public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			return SHIPPED;
		}
	},
	SHIPPED {
		@Override
		OrderStatus next() {
			return DELIVERED;
		}
	},
	// 예외처리 
	DELIVERED {
	    @Override
	    OrderStatus next() throws Exception {
	        throw new Exception("더이상 상태를 전환할 수 없습니다.");
	    }
	};
	
	// 각 상태에서 next() 메서드를 호출하면 다음 상태로 전환되도록 구현하기
	abstract OrderStatus next() throws Exception;
	
}
