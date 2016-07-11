package throwable_code;
/*
 	自定义异常
 	
 */
public class Demo10 {

	public static void main(String[] args) {
		H h = new H();
		int s;
			s = h.div(3, -1);
			System.out.println(s);
	}

}

class H {

	public int div(int a, int b) {
		if (b < 0) {
			throw new ArithmeticException("除数为负数");
		}
		return a / b;
	}
}

// 除数为负数也看成异常

class FuShuException extends Exception {

	private int num;

	FuShuException(String m, int num) {
		this.num = num;
	}

	FuShuException(String message) {
		super(message);
	}

	FuShuException() {
		super();
	}

}