package BT1905.Slide112;
import java.util.List;
import java.util.Scanner;

public class Student {
     public String hoten;
     public double diem;

     public String getHoten() {
          return hoten;
     }

     public double getdiem() {
          return diem;
     }

     public static void AddSv(List<Student> stdList) {
          Scanner sc = new Scanner(System.in);
          while(true){
            Student sv = new Student();
               System.out.print("Nhap ho ten :"); sv.hoten = sc.nextLine();
               if(sv.hoten.isEmpty()){
                    break;
               }
               System.out.print("Nhap diem :"); sv.diem = sc.nextDouble();
               sc.nextLine();
               stdList.add(sv);
          }
     }

     public static void Demsvthilai(List<Student> stdList) {
          int cnt = 0;
          System.out.println("Cac Sinh Vien thi lai la :");
          for (int i = 0; i < stdList.size(); i++) {
               if (stdList.get(i).diem <= 5) {
                    System.out.println("Sinh Vien thu :" + (i + 1));
                    System.out.println("hoten :" + stdList.get(i).hoten);
                    System.out.println("diem :" + stdList.get(i).diem);
                    ++cnt;
               }
          }
          System.out.println("So luong Sinh Vien thi lai la :" + cnt);
     }

     public static void SvDiemcaonhat(List<Student> stdList) {
          double max = stdList.get(0).diem;
          for (int i = 1; i < stdList.size(); i++) {
               if (stdList.get(i).diem > max) {
                    max = stdList.get(i).diem;
               }
          }
          System.out.println("Cac sinh vien co diem cao nhat: ");
          for (int i = 0; i < stdList.size(); i++) {
               if (stdList.get(i).diem == max) {
                    System.out.println("sinh vien thu :" + (i + 1));
                    System.out.println("hoten :" + stdList.get(i).hoten);
                    System.out.println("diem :" + stdList.get(i).diem);
               }
          }
     }

     public static void Timkiemsv(List<Student> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap vao ho ten:");
          String tmp = sc.nextLine();
          boolean check = false;
          for (Student sinhVien : std) {
               if (sinhVien.hoten.equals(tmp)) {
                    System.out.println("hoten :" + sinhVien.hoten);
                    System.out.println("diem :" + sinhVien.diem);
                    check = true;
               }
          }
          if (check == false) {
               System.out.println("khong tim thay !");
          }
     }

}
