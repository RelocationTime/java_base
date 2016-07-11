package throwable_code;

public class Demo13 {
	
	public static void main(String[] args) {
		Hh hh = new Hh();
		try {
		int t = hh.div(5, 0);
		System.out.println(t); 
		} catch(Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("over");
	}
}



class Hh {
	
	public int div(int a, int b) {
		return a/b;
	}
}