import java.util.Scanner;


/*
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。 
 */
public class Demo5 {
	
	
	public static void main(String[] args) {
		System.out.println("请输入学成成绩:");
		
		int value = new Scanner(System.in).nextInt();
		String str = "";
		if (value >= 90) {
			str = "A";
		} else if (value >= 60 && value < 89) {
			str = "B";
		} else {
			str = "C";
		}
		
		System.out.println("成绩等级为: " + str);
	}

}
