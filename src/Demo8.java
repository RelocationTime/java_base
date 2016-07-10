import java.util.Scanner;

/*
 *  题目：求s=a+aa+aaa+aaaa+aa...a的值，
 *  其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class Demo8 {

	public static void main(String[] args) {
			
		System.out.println("请输入多少项，由你决定 : ");
		int n = new Scanner(System.in).nextInt();
		long sum = 0;
		long s = 0;
		for (int i = 0; i < n; i++) {
			
			sum = sum * 10 + n;
			s = s + sum;
		}
		
		System.out.println("数值为: "  + s);
	}
}
