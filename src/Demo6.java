import java.util.Scanner;

/*
 * ��Ŀ����������������m��n���������Լ������С��������
 * 
 */
public class Demo6 {
	
	
	public static void main(String[] args) {
		
		System.out.println("������ʮ������: ");
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		int n = input.nextInt();
		int t = n*m;
		
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		int temp;
		while( m%n != 0) {
			
			temp = m%n;
			m = n;
			n = temp;
		}
		
		System.out.println("���Լ��" + n   + " ��С������" + t/n );
	}

}