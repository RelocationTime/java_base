import java.util.Scanner;

/*
 * 【程序15】   
 题目：输入三个整数x,y,z，请把这三个数由小到大输出。   

 */
public class Demo15 {

	public static void main(String[] args) {
		System.out.println("请输入3个数字： ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("三个数字为: " + a + " " + b + " " + c);

		if (a > b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}

		if (a > c) {
			a = a ^ c;
			c = a ^ c;
			a = a ^ c;
		}

		if (b > c) {
			b = b ^ c;
			c = b ^ c;
			b = b ^ c;
		}

		System.out.println("之后的数值: " + a + " " + b + " " + c);
	}

}
