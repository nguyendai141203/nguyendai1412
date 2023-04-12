import java.util.Scanner;

public class HinhTron {
	public float BanKinh;
	public float ChuVi;
	public float DienTich;
	final float Pi = 3.14f;
	public void NhapBanKinh() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh:");
		BanKinh=sc.nextFloat();
	}
	public float TinhChuVi() {
		ChuVi = 2*Pi*BanKinh;
		return ChuVi;
	}
	public float TinhDienTich() {
		DienTich = Pi*BanKinh*BanKinh;
		return DienTich;
	}
	public void InThongTin() {
		System.out.printf("\nHinh tron co ban kinh %.2f, co chu vi %.2f, co dien tich %.2f",BanKinh,TinhChuVi(),TinhDienTich());
	}
}
