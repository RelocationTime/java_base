package suanfa;
import java.util.Scanner;

/*
 * ������15��   
 ��Ŀ��������������x,y,z���������������С���������   

 */
public class Demo15 {

	public static void main(String[] args) {
		System.out.println("������3�����֣� ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("��������Ϊ: " + a + " " + b + " " + c);

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

		System.out.println("֮�����ֵ: " + a + " " + b + " " + c);
	}

}