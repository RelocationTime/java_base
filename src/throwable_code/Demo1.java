package throwable_code;

public class Demo1 {
		
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.fun();
	}
}


class Outer {
	
	public void fun() {
		//int a;
		final int a = 7;
		class Inner{
			public void show() {
			//	System.out.println(a);
				System.out.println(a);
				//���ڲ����з��ʱ��ر�������Ҫfinal
			}
		}
		
		Inner in = new Inner();
		in.show();
	}
}