import java.util.Scanner;

/*
 *  ��Ŀ����s=a+aa+aaa+aaaa+aa...a��ֵ��
 *  ����a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
 */
public class Demo8 {

	public static void main(String[] args) {
			
		System.out.println("����������������� : ");
		int n = new Scanner(System.in).nextInt();
		long sum = 0;
		long s = 0;
		for (int i = 0; i < n; i++) {
			
			sum = sum * 10 + n;
			s = s + sum;
		}
		
		System.out.println("��ֵΪ: "  + s);
	}
}