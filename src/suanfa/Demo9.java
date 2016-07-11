package suanfa;
/*
 * 【程序9】   题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程   找出1000以内的所有完数。   
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
