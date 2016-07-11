package suanfa;
import java.util.Scanner;

/*
 * 【程序4】   题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
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
