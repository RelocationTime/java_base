package zi_fu_chuang_suanfa;

import java.util.Arrays;

//½«×Ö·û´®·´×ª
public class Demo2 {

	public static String test(String str) {
		char[] cs = str.toCharArray();
		Arrays.sort(cs);

		return new String(cs);
	}

	public static void main(String[] args) {
		String s = "21edcba";
		// System.out.println(fanzhuan(s));
		System.out.println(test(s));
	}

	public static String fanzhuan(String str) {
		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length / 2; i++) {

			char temp = cs[i];
			cs[i] = cs[cs.length - 1 - i];
			cs[cs.length - i - 1] = temp;
		}

		return new String(cs);
	}

	public static String fanzhuan_sub(String str, int start, int end) {
		char[] cs = str.toCharArray();

		for (int i = 0; i < cs.length / 2; i++) {

			char temp = cs[i];
			cs[i] = cs[cs.length - 1 - i];
			cs[cs.length - i - 1] = temp;
		}

		return new String(cs);
	}

}
