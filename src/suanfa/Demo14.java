package suanfa;
import java.util.Scanner;

/*
 * ��Ŀ������ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿   
 */
public class Demo14 {

	public static void main(String[] args) {
		System.out.println("������ ���� �� ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();
		int sum = 0;
		int te = 0;
		if (isR(year)) {
			te = 29;
		} else {
			te = 28;
		}
		switch (month) {
		case 2:
			sum = 31;
			break;
		case 3:
			sum = 31 + te;
			break;
		case 4:
			sum = 31 + te + 31;
			break;
		case 5:
			sum = 31 + te + 31 + 30;
			break;
		case 6:
			sum = 31 + te + 31 + 30 + 31;
			break;
		case 7:
			sum = 31 + te + 31 + 30 + 31 + 30;
			break;
		case 8:
			sum = 31 + te + 31 + 30 + 31 + 30 + 31;
			break;
		case 9:
			sum = 31 + te + 31 + 30 + 31 + 30 + 31 + 31;
			break;
		case 10:
			sum = 31 + te + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			break;
		case 11:
			sum = 31 + te + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			break;
		case 12:
			sum = 31 + te + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			break;

		default:
		}
		System.out.println("��" + (sum + day) +"��");
	}

	public static boolean isR(int year) {

		boolean flag = false;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			flag = true;
		}

		return flag;
	}
}