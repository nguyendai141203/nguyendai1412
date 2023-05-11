package objectSets;

import java.util.Scanner;
import java.util.Set;
import objectLists.personL;

public class PersonS extends personL{
     public void NhapThongTin() {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap ho va ten : ");
          hvt = sc.nextLine();
          System.out.println("Nhap gioi tinh : ");
          gt = sc.nextLine();
          System.out.println("Nhap Can cuoc cong dan : ");
          cccd = sc.nextLine();
          System.out.println("Nhap so dien thoai : ");
          sdt = sc.nextLine();
          System.out.println("Nhap que quan : ");
          quocTich = sc.nextLine();
     }

     public static void ThemThongTin(Set<PersonS> prs) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so luong person :");
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
              PersonS ps = new PersonS();
               ps.NhapThongTin();
               prs.add(ps);
               System.out.println("Success");
          }
     }

     public static void HienTHi(Set<PersonS> prs) {
          System.out.println("******************************************");
          for (PersonS personS : prs) {
               System.out.println("---------------------");
               System.out.println("[person :] :\n" +
                         "Ho Va Ten :" + personS.hvt +"\n"+
                         "Gioi Tinh :" + personS.gt +"\n"+
                         "Can Cuoc Cong Dan :" + personS.cccd +"\n"+
                         "So Dien Thoai :" + personS.sdt +"\n"+
                         "Quoc Tich :" + personS.quocTich);
               System.out.println("---------------------");

          }
          System.out.println("******************************************");
     }

     public static void CapNhat(Set<PersonS> prs) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap Ho Va Ten can update :");
          String ten = sc.nextLine();
          boolean check = false;
          for (PersonS personS : prs) {
              if(personS.getHvt().equals(ten)){
                    PersonS hs = new PersonS();
                    prs.remove(personS);
                    hs.NhapThongTin();
                    prs.add(hs);
                    System.out.println("Success !");
                    check = true;
              }
          }
          if(!check){
               System.out.println("wrong data input !");
          }
     }

     public static void Xoa(Set<PersonS> prs) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap Ho Va Ten can Remove :");
          String ten = sc.nextLine();
          boolean check = false;
          for (PersonS personS : prs) {
              if(personS.getHvt().equals(ten)){
                    prs.remove(personS);
                    check = true;
              }
          }
          if(!check){
               System.out.println("wrong data input !");
          }
     }
}
