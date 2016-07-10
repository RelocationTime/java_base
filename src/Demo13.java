/*
 * 题目：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？   
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
