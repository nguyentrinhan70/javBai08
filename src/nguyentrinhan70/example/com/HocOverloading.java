package nguyentrinhan70.example.com;
public class HocOverloading {
	
	//Overloading khác nhau về kiểu dữ liệu
	public static int fn(int x, int y) {
		return x+y;
	}
	public static double fn(double x, double y) {
		return x+y+100;
	}
	
	//Overloading khác nhau về đối số
	public static int fn2(int x, int y, int z) {
		return (x+y+z);
		
	}
	public static int fn2(int x) {
		return x;
	}
	
	//Danh sách các biến parameter list
	public static int fn3(int ...arr) {
		int sum=0;
		for(int x: arr) {
			sum+=x;
		}
		return sum;
	}
	public static void main(String[] args) {

		//Test Overloading khác nhau về kiểu dữ liệu
		System.out.println("Kết quả truyền vào kiểu int=" + fn(3,5));
		System.out.println("Kết quả truyền vào kiểu double=" + fn(2.5,5.5));
		
		//Test Overloading khác nhau về đối số
		System.out.println("Kết quả truyền vào 3 đối số ="+ fn2(2,3,4));
		System.out.println("Kết quả truyền vào 1 đối số ="+ fn2(1));
		
		//Test parameter list
		System.out.println("Kết quả truyền vào 3 đối số: "+fn3(2,3,4));
		System.out.println("Kết quả truyền vào 5 đối số: "+fn3(1,5,2,3,4));
		
	}

}
