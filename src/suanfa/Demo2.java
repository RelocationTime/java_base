package suanfa;
/*
 *  ��Ŀ���ж�101-200֮���ж��ٸ��������������������
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