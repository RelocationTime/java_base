
/*
 ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ������ĸ��º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�   
1.���������   ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21....

 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 12; i++) {
			System.out.print("��" + i + "��" + "��  " + tuzi(i) + "ֻ\n");
		}
	}
	
	public static int tuzi(int month) {
		
		if (month == 1 || month == 2) {
			return 1;
		} 
		
		return tuzi(month-1) + tuzi(month-2);
	}
}