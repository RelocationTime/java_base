/*
 * ��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ������������磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
 */
public class Demo3 {
	
	
	public static void main(String[] args) {
		
		for (int i = 100; i < 1000; i++) {
			int b = i /100;
			int s = i/10%10;
			int g = i%10;
			if (i == (b*b*b + s*s*s + g*g*g)) {
				System.out.print( i + " ");
			}
		}
	}

}