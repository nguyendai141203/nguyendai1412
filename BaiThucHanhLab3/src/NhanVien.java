import java.util.Scanner;

public class NhanVien {
	
	public String HoTen;
	public int Tuoi;
	public float HeSoLuong;
	public float Luong;
	final int LuongCoBan = 1490000;
	
	public void NhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ho ten nhan vien:");
		HoTen=sc.nextLine();
		System.out.println("Nhap tuoi nhan vien:");
		Tuoi=sc.nextInt();
		System.out.println("Nhap he so luong cua nhan vien:");
		HeSoLuong=sc.nextFloat();
	}
	public int TinhLuong(){
		Luong = HeSoLuong*LuongCoBan;
		return Math.round(Luong);
	}
	public void InThongTin() {
		System.out.printf("Nhan vien %s, tuoi %d, co muc luong %.0f",HoTen,Tuoi,TinhLuong());
	}
}
