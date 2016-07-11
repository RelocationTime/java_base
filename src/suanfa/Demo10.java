package suanfa;
/*
 * 【程序10】 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在   第10次落地时，共经过多少米？第10次反弹多高？   
 */
public class Demo10 {

	public static void main(String[] args) {
		
		double last = 100;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum + last;
			last = last/2;
			
		}
		
		System.out.println("共经过: " + sum + "米");
		System.out.println("第10次反弹 " + last + "米");
		
	}
}
