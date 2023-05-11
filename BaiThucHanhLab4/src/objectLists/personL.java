package objectLists;

import java.util.List;
import java.util.Scanner;

public class personL {
     public String hvt;
     public String gt;
     public String cccd;
     public String sdt;
     public String quocTich;
     

     public String getHvt() {
          return hvt;
     }

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

     public static void ThemThongTin(List<personL> prs) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so luong person :");
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
               personL ps = new personL();
               ps.NhapThongTin();
               prs.add(ps);
               System.out.println("Success");
          }
     }

     public static void HienTHi(List<personL> prs) {
          System.out.println("******************************************");
          for (int i = 0; i < prs.size(); i++) {
               System.out.println("[person :" + i + "] :\n" +
                         "Ho Va Ten :" + prs.get(i).hvt +"\n"+
                         "Gioi Tinh :" + prs.get(i).gt +"\n"+
                         "Can Cuoc Cong Dan :" + prs.get(i).cccd +"\n"+
                         "So Dien Thoai :" + prs.get(i).sdt +"\n"+
                         "Quoc Tich :" + prs.get(i).quocTich);
          }
          System.out.println("******************************************");
     }

     public static void CapNhat(List<personL> prs) {
          Scanner sc = new Scanner(System.in);
          System.out.println("nhap vi tri can update :");
          int i = sc.nextInt();
          if (i >= 0 && i < prs.size()) {
               personL ps = prs.get(i);
               ps.NhapThongTin();
               prs.set(i, ps);
               System.out.println("Success");
          } else {
               System.out.println("Nhap sai vi tri !");
          }
     }

     public static void Xoa(List<personL> prs) {
		Scanner sc = new Scanner(System.in);
          System.out.println("xoa listAll nhap 2 - xoa index nhap 1");
          int sl = sc.nextInt();
          if(sl == 1){
               System.out.println("Nhap vao vi tri can xoa :");
               int i = sc.nextInt();
               if (i >= 0 && i < prs.size()) {
                    prs.remove(i);
                    System.out.println("Success");
               }else{
                    System.out.println("Nhap sai vi tri !");
               }
          }else if(sl == 2){
               prs.clear();
               System.out.println("Success");
          }else{
               System.out.println("wrong data input !");
          }
	}
}
