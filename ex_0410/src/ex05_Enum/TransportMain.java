package ex05_Enum;

public class TransportMain {

	public static void main(String[] args) {
		// 각 운송수단 별 100km 거리를 갔을 때 금액
		// name : xxx, 100km - fare : xxx
		Transportation[] trans = Transportation.values(); 
		
		for(Transportation ts : trans) {
			System.out.println("name : " + ts.name() + ", 100km - fare : " + ts.totalFare(100)+"원");
		}
		
		
	
		
		
		
		
	}

}
