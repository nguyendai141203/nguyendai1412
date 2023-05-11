package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import objectLists.StudentL;

public class ArrayListDemo extends StudentL {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          ArrayList<StudentL> StudentArrList = new ArrayList<>();
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
                    case 1: ThemThongTin(StudentArrList); break;
                    case 2:
                         if(StudentArrList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              CapNhat(StudentArrList);
                         }
                         break;
                    case 3:
                         if(StudentArrList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              Xoa(StudentArrList);
                         }
                         break;
                    case 4: HienTHi(StudentArrList); break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
