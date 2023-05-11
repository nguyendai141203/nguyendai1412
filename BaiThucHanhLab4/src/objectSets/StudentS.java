package objectSets;

import java.util.Scanner;
import java.util.Set;

import objectLists.StudentL;

public class StudentS extends StudentL {
     public void NhapThongTin() {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter full name: ");
          FullName = sc.nextLine();
          System.out.print("Enter age: ");
          Age = sc.nextInt();
     }

     public static void ThemThongTin(Set<StudentS> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so luong Student :");
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
               StudentS ps = new StudentS();
               ps.NhapThongTin();
               std.add(ps);
               System.out.println("Success");
          }
     }

     public static void HienTHi(Set<StudentS> std) {
          System.out.println("******************************************");
          for (StudentS hs : std) {
               System.out.println("---------------------");
               System.out.println("[person :] :\n" +
                         "Ho Va Ten :" + hs.FullName + "\n" +
                         "Tuoi:" + hs.Age );
               System.out.println("---------------------");

          }
          System.out.println("******************************************");
     }

     public static void CapNhat(Set<StudentS> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap Ho Va Ten can update :");
          String ten = sc.nextLine();
          boolean check = false;
          for (StudentS hs : std) {
               if (hs.getFullName().equals(ten)) {
                    StudentS st = new StudentS();
                    std.remove(hs);
                    hs.NhapThongTin();
                    std.add(st);
                    System.out.println("Success !");
                    check = true;
               }
          }
          if (!check) {
               System.out.println("wrong data input !");
          }
     }

     public static void Xoa(Set<StudentS> std) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap Ho Va Ten can Remove :");
          String ten = sc.nextLine();
          boolean check = false;
          for (StudentS hs : std) {
               if (hs.getFullName().equals(ten)) {
                    std.remove(hs);
                    check = true;
               }
          }
          if (!check) {
               System.out.println("wrong data input !");
          }
     }
}
