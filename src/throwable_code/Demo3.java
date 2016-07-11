package throwable_code;
public class Demo3 {

	public static void main(String[] args) {
		TtT.fun().show();
	}
}

class TtT {

	public static inter3 fun() {
		return new inter3() {

			@Override
			public void show() {
				System.out.println("show");
			}

		};
	}
}

interface inter3 {
	public abstract void show();
}
