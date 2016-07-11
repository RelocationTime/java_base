package throwable_code;
public class Demo17 {

	public static void main(String[] args) {

		Teacher t = new Teacher("����ʦ");
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
			throw new LanPing("����������");
		} else if (state == 3) {
			throw new MaiYan("����ð����");
		} else {
			System.out.println("��������.....");
			state = 1;
		}
	}

	public void reset() {
		System.out.println("��������");
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
		System.out.println(name + "Ҫ�Ͽ�");
		try {
			c.run();
		} catch (LanPing e) {
			System.out.println(e.getMessage());
		} catch (MaiYan e) {
			System.out.println(e.getMessage());
			c.reset();
			throw new ClassError("���Ե����⣬�ϲ��˿��ˣ������Ϣ");
		}
	}

}