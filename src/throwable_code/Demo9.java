package throwable_code;

public class Demo9{
	
	public static void main(String[] args) throws Exception {
		int result;
			try {
				result = T.div(3, 0);
				System.out.println("result = " + result);
			} catch (ArithmeticException e) {
				//�����쳣Ҫд�ڸ����쳣ǰ��
				e.printStackTrace();
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
	}
}


class T {
	//�����ú��������ܷ�����
	public static int div(int a, int b )  throws ArithmeticException, ArrayIndexOutOfBoundsException{
		int[] arr = new int[5];
		System.out.println(arr[8]);
		return a/b;
	}
}