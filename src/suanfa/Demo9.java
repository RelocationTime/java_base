package suanfa;
/*
 * ������9��   ��Ŀ��һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.���   �ҳ�1000���ڵ�����������   
 */
public class Demo9 {
	
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 1000; i++) {
			if (i == yinZi(i)) {
				System.out.println(i);
			}
		}
	}

	
	public static int yinZi(int d) {
		
		int sum = 0;
		for (int i = 1; i < d; i++) {
			if (d % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
}