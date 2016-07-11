package throwable_code;
/*
 	try {
 		可能发生的异常的代码
 	} catch(异常类 ) {
 		处理异常的代码
 	}
 */
public class Demo7 {

	public static void main(String[] args) {

		Math math = new Math();

		String s3 = "sdfsdf";
		try {
			int i = math.div(3, 0); //new ArithmeticExcetion
			System.out.println(i);

		} catch (Exception e) { // e = new ArrithmeticEcectiion 多态
			System.out.println("除数为0了");
		}
		
		System.out.println("over");//程序会继续执行
	}
}

class Math {

	public int div(int a, int b) {
		return a / b;
	}
}