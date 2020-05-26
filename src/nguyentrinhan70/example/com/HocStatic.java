package nguyentrinhan70.example.com;

public class HocStatic {

	public static int x = 5; //x chính là class member tĩnh
	public int y;
	public static void fn() {
		System.out.println(y);//Không gọi được vì phương thức tình không thể gọi y
		System.out.println(x);
	}
	public void fn2() { //Phương thức không static gọi được static và không đều được
		System.out.println(y);
		System.out.println(x);
	}
	public static void main(String[] args) {

		
	}

}
