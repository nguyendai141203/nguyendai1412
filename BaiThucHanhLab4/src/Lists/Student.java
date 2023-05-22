package Lists;
import java.util.List;
import java.util.Scanner;

public class Student {
    public String HoTen;
    public int Tuoi;
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Ten");
        HoTen=sc.nextLine();
        System.out.println("Nhap Tuoi");
        Tuoi=sc.nextInt();
    }
    public void HienThi(List<Student> lst){
        for (Student std:lst){
            System.out.println(std.HoTen+"-"+std.Tuoi);
        }
    }
    public void ThemThongTin(List<Student> lst,int n){
        for ( int i=0;i<n;i++){
            Student std = new Student();
            std.NhapThongTin();
            lst.add(std);
        }
    }
    public void SuaThongTin(List<Student> lst, String n){
        for(Student std:lst){
            if(std.HoTen.toLowerCase() == n.toLowerCase()){
                System.out.println("Nhap Ten can sua");
                std.HoTen= sc.nextLine();
                System.out.println("Nhap Tuoi can sua");
                std.Tuoi = sc.nextInt();
                return;
            }
        }
        System.out.println("Khong tim thay ten can sua ");
    }
}