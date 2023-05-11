package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import objectLists.personL;

public class LinkedListDemo1 extends personL {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          LinkedList<personL> PersonLinkList = new LinkedList<>();
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
                    case 1: ThemThongTin(PersonLinkList); break;
                    case 2:
                         if(PersonLinkList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              CapNhat(PersonLinkList);
                         }
                         break;
                    case 3:
                         if(PersonLinkList.isEmpty()){
                              System.out.println("Empty info");
                         }else{
                              Xoa(PersonLinkList);
                         }
                         break;
                    case 4: HienTHi(PersonLinkList); break;
                    default:
                         System.out.println("wrong data input !");
               }
          }
     }
}
