package throwable_code;

public class Demo9{
	
	public static void main(String[] args) throws Exception {
		int result;
			try {
				result = T.div(3, 0);
				System.out.println("result = " + result);
			} catch (ArithmeticException e) {
				//子类异常要写在父类异常前面
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	}
}


class T {
	//声明该函数，可能发生生
	public static int div(int a, int b )  throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int[] arr = new int[5];
		System.out.println(arr[8]);
		return a/b;
	}
}
