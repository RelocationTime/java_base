package throwable_code;

public class Demo8 {
	
	public static void main(String[] args) {
		M m = new M();
		int result;
		try {
			result = m.div(3, 0);
			System.out.println("result = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class M {
	//声明该函数，可能发生生
	public int div(int a, int b )  throws Exception{
		return a/b;
	}
}
