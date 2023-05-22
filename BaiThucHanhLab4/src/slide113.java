package BT1905;

import java.util.Scanner;
import java.util.HashSet;

public class slide113 {
    public static void main(String[] args) {
        HashSet<String> Fruitset = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        Fruitset.add("Tao");
        Fruitset.add("Xoai");
        Fruitset.add("Oi");
        Fruitset.add("Mit");
        System.out.println("Cac phan tu trong Fruitset la :" + Fruitset);
        System.out.println("So phan tu co trong Fruitset la :" + Fruitset.size());
        System.out.println("Nhap ten trai cay co ton tai hay khong :"); String NameFind = sc.nextLine();
        boolean check = false;

        for (String string : Fruitset) {
             if(string.equals(NameFind)){
                  System.out.println("Found");
                  check = true;
             }
        }

        if(check == false){
             System.out.println("Not Found !");
        }

        System.out.println("Cac phan tu trong Fruitset la :" + Fruitset);
        Fruitset.remove("Oi");
        System.out.println("Cac phan tu trong Fruitset khi xoa 1 phan tu bat ky la :" + Fruitset);
        }
    }