package throwable_code;
public class Demo17 {

	public static void main(String[] args) {

		Teacher t = new Teacher("张老师");
		Computer c = new Computer();
		c.setState(3);
		try {
			t.teach(c);
		} catch (ClassError e) {
			System.out.println(e.getMessage());
		}

	}
}

class LanPing extends Exception {

	LanPing() {
		super();

	}

	LanPing(String message) {
		super(message);
	}
}

class MaiYan extends Exception {

	MaiYan() {
		super();
	}

	MaiYan(String message) {
		super(message);
	}
}

class Computer {

	public void setState(int state) {
		this.state = state;
	}

	private int state = 1;

	public void run() throws LanPing, MaiYan {
		if (state == 2) {
			throw new LanPing("电脑蓝屏了");
		} else if (state == 3) {
			throw new MaiYan("电脑冒烟了");
		} else {
			System.out.println("电脑运行.....");
			state = 1;
		}
	}

	public void reset() {
		System.out.println("电脑重启");
	}

}

class ClassError extends Exception {

	public ClassError() {
		super();
	}

	public ClassError(String message) {
		super(message);
	}

}

class Teacher {

	private Computer computer;
	private String name;

	public Teacher(String t) {
		name = t;
	}

	public void teach(Computer c) throws ClassError {
		System.out.println(name + "要上课");
		try {
			c.run();
		} catch (LanPing e) {
			System.out.println(e.getMessage());
		} catch (MaiYan e) {
			System.out.println(e.getMessage());
			c.reset();
			throw new ClassError("电脑的问题，上不了课了，大家休息");
		}
	}

}
