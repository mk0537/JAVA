package ex05_Enum;

public class OperationMain {

	public static void main(String[] args) {
		Operation[] op = Operation.values();
		
		for(Operation oper : op) {
			System.out.println(oper.name() + " 결과 : " + oper.result(10, 5) );
		}

	}

}
