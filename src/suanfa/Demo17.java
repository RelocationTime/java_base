package suanfa;
/*
 * ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ�
 * ��������һ�룬����񫣬�ֶ����һ��     �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
 * �Ժ�ÿ�����϶�����ǰһ��ʣ��     ��һ����һ��������10���������ٳ�ʱ��
 * ��ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
 */
public class Demo17 {

	public static void main(String[] args) {

		System.out.println("��һ��Ե�������Ϊ: " + eatTao(1));

	}

	public static int eatTao(int day) {
		int sum = 0;
		if (day == 10) {
			return sum = 1;
		}

		return 2 * eatTao(day + 1) + 2;
	}
}