package zi_fu_chuang_suanfa;
//Ä£Äâtrim·½·¨
public class Demo1 {
	
	public static void main(String[] args) {
		String ss = "   asfaf  aff ";
		System.out.println(myTrim(ss));
	}
	
	
	public static String myTrim(String msg) {
		int start = 0;
		int end = msg.length() - 1;
		
		while(msg.charAt(start) == ' ')
			start++;
		while(msg.charAt(end) == ' ')
			end--;
		
		return msg.substring(start, end+1);
	}

}
