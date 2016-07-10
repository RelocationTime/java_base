import java.util.Scanner;

/*
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 */
public class Demo6 {
	
	
	public static void main(String[] args) {
		
		System.out.println("请输入十个数字: ");
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
		
		System.out.println("最大公约数" + n   + " 最小公倍数" + t/n );
	}

}
