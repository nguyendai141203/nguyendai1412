package Sets;

import java.util.HashSet;
import java.util.Scanner;

import objectSets.PersonS;

public class HasSetDemo1 extends PersonS {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          HashSet<PersonS> PersonHashSet = new HashSet<>();
          boolean f = true;
          while (f) {
               System.out.println("-------- menu ---------");
               System.out.println("1. Add new person");
               System.out.println("2. Update person information");
               System.out.println("3. Remove person");
               System.out.println("4. Display all persons");
               System.out.println("0. Exit");
               System.out.println("nhap lua chon :");
               int select = sc.nextInt();
               switch (select) {
                    case 1:
                         ThemThongTin(PersonHashSet);
                         break;
                    case 2:
                         if (PersonHashSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              CapNhat(PersonHashSet);
                         }
                         break;
                    case 3:
                         if (PersonHashSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              Xoa(PersonHashSet);
                         }
                         break;
                    case 4:
                         if (PersonHashSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              HienTHi(PersonHashSet);
                         }
                         break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
