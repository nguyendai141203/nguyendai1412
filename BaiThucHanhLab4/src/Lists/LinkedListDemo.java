package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import objectLists.StudentL;

public class LinkedListDemo extends StudentL {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          LinkedList<StudentL> StudentLinkList = new LinkedList<>();
          boolean f = true;
          while(f){
               System.out.println("-------- menu ---------");
               System.out.println("1. Add new student");
               System.out.println("2. Update student information");
               System.out.println("3. Remove student");
               System.out.println("4. Display all students");
               System.out.println("0. Exit");
               System.out.println("nhap lua chon :");
               int select = sc.nextInt();
               switch(select){
                    case 1: ThemThongTin(StudentLinkList); break;
                    case 2:
                         if(StudentLinkList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              CapNhat(StudentLinkList);
                         }
                         break;
                    case 3:
                         if(StudentLinkList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              Xoa(StudentLinkList);
                         }
                         break;
                    case 4: HienTHi(StudentLinkList); break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
