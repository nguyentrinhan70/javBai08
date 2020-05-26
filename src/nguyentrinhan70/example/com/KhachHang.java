package nguyentrinhan70.example.com;

public class KhachHang {

	private String maKH;
	private String tenKH;
	private int tuoi;
	private String diaChi;
	
	private static double x;
	public void doiThongTinX(int gtMoi) {
		x=gtMoi;
	}
	public double layThongTinX() {
		return x;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public KhachHang(String maKH, String tenKH, int tuoi, String diaChi) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return(this.maKH + this.tenKH+this.tuoi+this.diaChi);
	}
}
