package throwable_code;

public class Demo6 {
	
	public static void main(String[] args) {
		MyMath math = new MyMath();
		int result = math.div(3, 0);
		System.out.println("result = " + result);
	}
}

class MyMath {
	
	public int div(int a, int b) {
		return a/b;
	}
}