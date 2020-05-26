package nguyentrinhan70.example.com;

public class TestTamGiac {

	public static void main(String[] args) {

		TamGiac tg = new TamGiac();
		tg.setCanhA(1.3);
		tg.setCanhB(2.3);
		tg.setCanhC(2.5);
		System.out.println(tg);
		System.out.println("Diện tích tam giác: " + tg.dienTich());
		System.out.println("Chu vi tam giác: " +tg.chuVi());
		
		TamGiac tamGiac = new TamGiac(2.1,3.0,4.0);
		System.out.println("Diện tích tam giác: " + tamGiac.dienTich());
		System.out.println("Chu vi tam giác: " +tamGiac.chuVi());
		
	}

}
