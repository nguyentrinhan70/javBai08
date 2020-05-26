package nguyentrinhan70.example.com;

public class KhachHang1 {
	private String maKH;
	private String tenH;
	private int tuoi;
	private String diaChi;
	
	public KhachHang1() {
		super();
	}
	public String getMaKH() {
		return maKH;
	}
	public KhachHang1(String maKH, String tenH, int tuoi, String diaChi) {
		super();
		this.maKH = maKH;
		this.tenH = tenH;
		this.tuoi = tuoi;
		this.diaChi = diaChi;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenH() {
		return tenH;
	}
	public void setTenH(String tenH) {
		this.tenH = tenH;
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
	

}
