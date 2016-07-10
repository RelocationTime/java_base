import java.util.Scanner;

/*
 * 【程序7】   题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。   
 */

public class Demo7 {

	
	public static void main(String[] args) {
		
		System.out.println("请输入一行字符: ");
		String data = new Scanner(System.in).nextLine();
		
		int y = 0;
		int s = 0;
		int k = 0;
		int q = 0;
		char[] cs = data.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] >='A' && cs[i] <='z') {
				y++;
			} else if (cs[i] >= '0' && cs[i] <= '9') {
				s++;
			} else if (cs[i] == ' ') {
				k++;
			} else {
				q++;
			}
		}
		
		System.out.println("字母个数: " + y);
		System.out.println("空格个数: " + k);
		System.out.println("数字个数: " + s);
		System.out.println("其它个数: " + q);
		
	}
}
