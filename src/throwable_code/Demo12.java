package throwable_code;
//获取一个数组中指定下标的值
public class Demo12 {
	
	public static void main(String[] args) {
		V v = new V();
		int[] arr = new int[]{3,2,343,4};
		int i = 72;
		int num = v.getNum(arr, i);
		System.out.println(num);
	}
}



class V {
	
	public int getNum(int[] arr, int i) {
		if (i < 0 || i > arr.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return arr[i];
	}
}
