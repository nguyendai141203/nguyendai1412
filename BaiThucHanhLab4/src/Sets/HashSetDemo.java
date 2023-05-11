package Sets;

import java.util.HashSet;
import java.util.Scanner;

import objectSets.StudentS;

public class HashSetDemo extends StudentS {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          HashSet<StudentS> StudentHasSet = new HashSet<>();
          boolean f = true;
          while (f) {
               System.out.println("-------- menu ---------");
               System.out.println("1. Add new student");
               System.out.println("2. Update student information");
               System.out.println("3. Remove student");
               System.out.println("4. Display all students");
               System.out.println("0. Exit");
               System.out.println("nhap lua chon :");
               int select = sc.nextInt();
               switch (select) {
                    case 1:
                         ThemThongTin(StudentHasSet);
                         break;
                    case 2:
                         if (StudentHasSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              CapNhat(StudentHasSet);
                         }
                         break;
                    case 3:
                         if (StudentHasSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              Xoa(StudentHasSet);
                         }
                         break;
                    case 4:
                         if (StudentHasSet.isEmpty()) {
                              System.out.println("Empty info");
                         } else {
                              HienTHi(StudentHasSet);
                         }
                         break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
