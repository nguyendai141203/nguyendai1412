import java.util.Scanner;

public class HinhTruTron {
	//thuoc tinh
	public float BanKinh;
	public float DienTichDay;
	public float DienTichXungQuanh;
	public float DienTich;
	public float TheTich;
	public float ChieuCao;
	final float Pi = 3.14f;
	
	//phuong thuc
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh:");
		BanKinh=sc.nextFloat();
		System.out.println("Nhap chieu cao:");
		ChieuCao=sc.nextFloat();
	}
	public float TinhDienTichXungQuanh() {
		DienTichXungQuanh = 2*Pi*BanKinh*ChieuCao;
		return DienTichXungQuanh;
	}
	public float TinhDienTichDay() {
		DienTichDay = Pi*BanKinh*BanKinh;
		return DienTichDay;
	}
	public float TinhDienTichToanPhan() {
		DienTich = DienTichXungQuanh + 2*DienTichDay;
		return DienTich;
	}
	public float TinhTheTich() {
		TheTich = Pi*BanKinh*BanKinh*ChieuCao;
		return TheTich;
	}
	public void InThongTin() {
		System.out.printf("Hinh tru tron co ban kinh %.2f, chieu cao %.2f, dien tich xung quanh %.2f,"
				+ " dien tich toan phan %.2f, the tich %.2f",BanKinh,ChieuCao,TinhDienTichXungQuanh(),TinhDienTichToanPhan(),TinhTheTich());
	}
}
