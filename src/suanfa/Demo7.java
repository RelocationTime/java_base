package suanfa;
import java.util.Scanner;

/*
 * ������7��   ��Ŀ������һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����   
 */

public class Demo7 {

	
	public static void main(String[] args) {
		
		System.out.println("������һ���ַ�: ");
		String data = new Scanner(System.in).nextLine();
		
		int y = 0;
		int s = 0;
		int k = 0;
		int q = 0;
		char[] cs = data.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] >='A' && cs[i] <='z') {
				y++;
			} else if (cs[i] >= '0' && cs[i] <= '9') {
				s++;
			} else if (cs[i] == ' ') {
				k++;
			} else {
				q++;
			}
		}
		
		System.out.println("��ĸ����: " + y);
		System.out.println("�ո����: " + k);
		System.out.println("���ָ���: " + s);
		System.out.println("��������: " + q);
		
	}
}