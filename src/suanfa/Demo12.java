package suanfa;
import java.util.Scanner;

/*
 * ��Ŀ����ҵ���ŵĽ������������ɡ�
 * ����(I)���ڻ����10��Ԫʱ���������10%
 * ���������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
 * ����10��Ԫ�Ĳ��֣��ɿ����7.5%��
 * 
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
 * ����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 * �Ӽ������뵱������I����Ӧ���Ž���������
 */
public class Demo12 {
	


	public static void main(String[] args) {
		System.out.println("������������: ");
		int money = new Scanner(System.in).nextInt();
		double sum = 0;
		if (money <= 10) {
			sum = sum * 0.1; 
		} else if (money > 10 && money <= 20) {
			sum = 10 * 0.1 + (money - 10) * 0.075;
		} else if (money > 20 && money <= 40) {
			sum = 10 * 0.1 + 10 * 0.075 + (money - 20) * 0.05;
		} else if (money > 40 && money <= 60) {
			sum = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + (money - 40) * 0.03;
		} else if(money > 60 && money <= 100) {
			sum = 10 * 0.1 + 10 * 0.075 + 20 *0.05 + 40 * 0.03 + (money - 60) * 0.015;
		} else if (money > 100) {
			sum = 10 * 0.1 + 10 * 0.075 + 20 * 0.05 + 40 * 0.03 + 60 * 0.015 + (money - 100) * 0.01;
		}
		
		System.out.println("sum " + sum + "��");
	}
}