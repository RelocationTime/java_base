package suanfa;
import java.util.Scanner;


/*
 * ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ�� 
 */
public class Demo5 {
	
	
	public static void main(String[] args) {
		System.out.println("������ѧ�ɳɼ�:");
		
		int value = new Scanner(System.in).nextInt();
		String str = "";
		if (value >= 90) {
			str = "A";
		} else if (value >= 60 && value < 89) {
			str = "B";
		} else {
			str = "C";
		}
		
		System.out.println("�ɼ��ȼ�Ϊ: " + str);
	}

}