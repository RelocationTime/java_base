import java.util.Scanner;

/*
 * ������4��   ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
 */
public class Demo4 {

	public static void main(String[] args) {

		int value  =  new Scanner(System.in).nextInt();
		int flag = 0;
		for (int i = 2; i <= value; i++) {
			
			while(value % i ==0) {
				flag++;
				if (flag == 1) {
					System.out.print(value + "=" + i);
				}else {
					System.out.print("*" + i);
				}
				
				value = value/i;
			}
		}
	}	
}