/*
 * ��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�   
 */
public class Demo13 {
	
	public static void main(String[] args) {
			
		long a;
		long b;
		for (int i = 0; i < 100000; i++) {
			a = (long)Math.sqrt(i+100);
			b = (long)Math.sqrt(i+100+168);
			if ( (a*a == (i+100)) && (b*b == (i + 100 + 168) )) {
				System.out.println(i);
			}
		}
		
		
		
	}
	
}