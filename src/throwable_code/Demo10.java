package throwable_code;
/*
 	�Զ����쳣
 	
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
			throw new ArithmeticException("����Ϊ����");
		}
		return a / b;
	}
}

// ����Ϊ����Ҳ�����쳣

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