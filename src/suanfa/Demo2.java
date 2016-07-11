package suanfa;
/*
 *  题目：判断101-200之间有多少个素数，并输出所有素数
 */
public class Demo2 {
	
	
	
	public static void main(String[] args) {
			
		for (int i = 101; i < 200; i++) {
			if (isSuShu(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	
	public static boolean isSuShu(int x) {
		
		boolean flag = false;
		for (int i = 2; i <= Math.sqrt(x); i++) {
			if(x%i==0) {
				flag =  false;
				break;
			}
			
			flag =  true;
		}
		
		return flag;
	}

}
