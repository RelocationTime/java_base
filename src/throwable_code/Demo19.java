package throwable_code;

public class Demo19 {
	
	public static void main(String[] args) {
			
		sop("faasdfsdf".length());
		System.out.println(checkEmail("fsffd@qq.com"));
	}
	
	//验证邮箱是否正确
	
	public static boolean checkEmail(String s) {
		if (s.indexOf('@') == -1) {
			return false;
		} else if (s.indexOf('.') == -1) {
			return false;
		} else if (s.indexOf('@') > s.indexOf('.')) {
			return false;
		} else {
			return true;
		}
	}
	public static void sop(Object obj) {
		System.out.println(obj);
	}
}
