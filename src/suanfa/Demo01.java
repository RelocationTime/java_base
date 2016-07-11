package suanfa;

/*
 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
1.程序分析：   兔子的规律为数列1,1,2,3,5,8,13,21....

 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 12; i++) {
			System.out.print("第" + i + "月" + "有  " + tuzi(i) + "只\n");
		}
	}
	
	public static int tuzi(int month) {
		
		if (month == 1 || month == 2) {
			return 1;
		} 
		
		return tuzi(month-1) + tuzi(month-2);
	}
}
