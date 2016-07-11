package throwable_code;

public class Demo14 {
	
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch (Exception e) {
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		//和异常没有关系
		try {
			//猎取资源
		} finally {
			//释放资源
		}
	}
}
