/*
 * ������10�� ��Ŀ��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£�������   ��10�����ʱ�������������ף���10�η�����ߣ�   
 */
public class Demo10 {

	public static void main(String[] args) {
		
		double last = 100;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + last;
			last = last/2;
			
		}
		
		System.out.println("������: " + sum + "��");
		System.out.println("��10�η��� " + last + "��");
		
	}
}