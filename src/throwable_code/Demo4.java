package throwable_code;
interface OnClickListener {

	public abstract void onClick();
}

class Button {
	private OnClickListener onClickListener;
	private boolean isClick = true;

	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

	public void performClick() {
		if (isClick) {
			onClickListener.onClick();

		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		Button btn = new Button();
		btn.setOnClickListener(new ButtonClick());
		btn.performClick();//
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println(" click ");
			}
		});
		
		btn.performClick();
		
	}
}

class ButtonClick implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("ÎÒ±»µã»÷");

	}

}
