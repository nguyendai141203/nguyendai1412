package objectLists;

import java.util.List;
import java.util.Scanner;

public class StudentL {
     public String FullName;
     public int Age;

     public String getFullName() {
          return FullName;
     }

     public void NhapThongTin() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter full name: ");
          FullName = sc.nextLine();
          System.out.print("Enter age: ");
          Age = sc.nextInt();
     }

     public static void ThemThongTin(List<StudentL> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so luong Student :");
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
               StudentL hs = new StudentL();
               hs.NhapThongTin();
               std.add(hs);
               System.out.println("Success");
          }
     }

     public static void HienTHi(List<StudentL> std) {
          System.out.println("******************************************");
          for (int i = 0; i < std.size(); i++) {
               System.out.println("[Student :" + i + "] :\n" +
                         "Ho Va Ten :" + std.get(i).FullName +"\n"+
                         "Tuoi :" + std.get(i).Age +"\n");
          }
          System.out.println("******************************************");
     }

     public static void CapNhat(List<StudentL> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap vi tri can update :");
          int i = sc.nextInt();
          if (i >= 0 && i < std.size()) {
               StudentL hs = std.get(i);
               hs.NhapThongTin();
               std.set(i, hs);
               System.out.println("Success");
          } else {
               System.out.println("Nhap sai vi tri !");
          }
     }

     public static void Xoa(List<StudentL> std) {
		Scanner sc = new Scanner(System.in);
          System.out.println("xoa listAll nhap 2 - xoa index nhap 1");
          int sl = sc.nextInt();
          if(sl == 1){
               System.out.println("Nhap vao vi tri can xoa :");
               int i = sc.nextInt();
               if (i >= 0 && i < std.size()) {
                    std.remove(i);
                    System.out.println("Success");
               }else{
                    System.out.println("Nhap sai vi tri !");
               }
          }else if(sl == 2){
               std.clear();
               System.out.println("Success");
          }else{
               System.out.println("wrong data input !");
          }
	}
}
