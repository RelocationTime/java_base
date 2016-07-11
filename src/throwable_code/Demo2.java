package throwable_code;
//匿名内部类 就是不知道类名的内部类

abstract class Test {
	public abstract void show();
}

class Outer1 {
	class Inter extends Test {

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println("show");
		}

		public void fun() {
			System.out.println("fun");
		}
	}

	public void function() {
		// 创建了一个Test的子类
		//大括号中定义的是子类中的成员
		new Test() { //Test的子类对象
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("show");
			}

			public void fun() {
				System.out.println("fun");
			}

		}.show();
		System.out.println(new Object () {
			String name = "abc";
			int age = 20;
			@Override
			public String toString() {
				return name + "," + age;
			}
		});
	}
}


interface inter {
	public abstract void sleep();
}
public class Demo2 {

	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.function();
		ff(new inter(){

			@Override
			public void sleep() {
				System.out.println("我要sleep");
			}
			
		});
	}
	
	public static void ff(inter in) {
		in.sleep();
	}
}
