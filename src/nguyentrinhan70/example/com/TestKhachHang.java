package nguyentrinhan70.example.com;

public class TestKhachHang {

	public static void main(String[] args) {

		KhachHang kH = new KhachHang();
		System.out.println(kH);
		kH.setMaKH("KH001");
		kH.setTenKH("Nguyễn Trí Nhân");
		kH.setTuoi(50);
		kH.setDiaChi("Phổ Cường, Đức Phổ, Quảng Ngãi");
		System.out.println(kH);
		
		KhachHang teo = new KhachHang();
		teo.setTenKH("Hồ Thị Tèo");
		KhachHang ty = new KhachHang();
		ty.setTenKH("Nguyễn Văn Tý");
		System.out.println("Tên của Tèo là: "+ teo.getTenKH());
		System.out.println("Tên của Tý là: "+ ty.getTenKH());
		//Cơ chế gom rác tự động alias
		teo = ty;
		teo.setTenKH("Hồ Văn Đồ");
		System.out.println("Tên của Tý là: "+ ty.getTenKH());
		//ô nhớ teo bầy giờ cùng trỏ vào ty và ô nhớ teo bị thu hồi
		
		System.out.println(teo.layThongTinX());
		KhachHang an = new KhachHang();
		an.doiThongTinX(100);
		System.out.println("Teo cũng đổi theo: "+teo.layThongTinX());//an đổi teo cũng đổi theo.
		System.out.println("Ty cũng đổi theo: "+ty.layThongTinX());
		
		KhachHang binh = new KhachHang();
		System.out.println("binh cũng đổi theo: "+binh.layThongTinX());
	}

}
