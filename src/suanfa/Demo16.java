package suanfa;
/*
 * ��Ŀ�����9*9�ھ���     
 */
public class Demo16 {
	
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " * " + i + " = " + (j*i) + "   ");
			}
			System.out.println();
		}
	}
}
