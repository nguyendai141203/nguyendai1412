package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import objectLists.personL;

public class ArrayListDemo1 extends personL{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          ArrayList<personL> PersonArrList = new ArrayList<>();
          boolean f = true;
          while(f){
               System.out.println("-------- menu ---------");
               System.out.println("1. Add new person");
               System.out.println("2. Update person information");
               System.out.println("3. Remove person");
               System.out.println("4. Display all persons");
               System.out.println("0. Exit");
               System.out.println("nhap lua chon :");
               int select = sc.nextInt();
               switch(select){
                    case 1: ThemThongTin(PersonArrList); break;
                    case 2:
                         if(PersonArrList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              CapNhat(PersonArrList);
                         }
                         break;
                    case 3:
                         if(PersonArrList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              Xoa(PersonArrList);
                         }
                         break;
                    case 4: HienTHi(PersonArrList); break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
