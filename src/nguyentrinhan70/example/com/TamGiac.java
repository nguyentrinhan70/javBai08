package nguyentrinhan70.example.com;

public class TamGiac {
	private double canhA;
	private double canhB;
	private double canhC;
	
	public TamGiac() {
		super();
	}
	public TamGiac(double canhA, double canhB, double canhC) {
		super();
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	public double getCanhA() {
		return canhA;
	}
	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}
	public double getCanhB() {
		return canhB;
	}
	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}
	public double getCanhC() {
		return canhC;
	}
	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cạnh a = " +this.canhA +" Cạnh b= "+ this.canhB + " Cạnh c= " + this.canhC;
	}
	public double chuVi() {
		if(kiemTra())
			return((this.canhA+this.canhB+this.canhC));
		else
			return 0;
		
	}
	private boolean kiemTra() {
		return (this.canhA>0 && this.canhB>0 && this.canhC>0 &&
				(this.canhA+this.canhB)>this.canhC&&
				(this.canhA+this.canhC)>this.canhB &&(this.canhB+this.canhC)>this.canhA);
	}
	public double dienTich() {
		if(kiemTra()) {
			double p = chuVi()/2;
		return(Math.sqrt(p*(p-this.canhA)*(p-this.canhB)*(p-this.canhC)));
		}
		return 0;
		
	}

}
