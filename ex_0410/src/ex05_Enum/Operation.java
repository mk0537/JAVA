package ex05_Enum;

public enum Operation {
	PLUS {
		@Override
		int result(int x, int y) {
			return x + y;
		}
	},
	MINUS {
		@Override
		int result(int x, int y) {
			if(x < y) {
				return y - x;
			} else {
				return x - y;
			}
		}
	},
	MULTI {
		@Override
		int result(int x, int y) {
			return x * y;
		}
	},
	DIV {
		@Override
		int result(int x, int y) {
			return x / y;
		}
	};
	
	abstract int result(int x, int y);
	
}
