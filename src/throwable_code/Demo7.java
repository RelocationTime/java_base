package throwable_code;
/*
 	try {
 		���ܷ������쳣�Ĵ���
 	} catch(�쳣�� ) {
 		�����쳣�Ĵ���
 	}
 */
public class Demo7 {

	public static void main(String[] args) {

		Math math = new Math();

		String s3 = "sdfsdf";
		try {
			int i = math.div(3, 0); //new ArithmeticExcetion
			System.out.println(i);

		} catch (Exception e) { // e = new ArrithmeticEcectiion ��̬
			System.out.println("����Ϊ0��");
		}
		
		System.out.println("over");//��������ִ��
	}
}

class Math {

	public int div(int a, int b) {
		return a / b;
	}
}