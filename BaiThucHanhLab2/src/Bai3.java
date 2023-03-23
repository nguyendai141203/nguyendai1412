import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap so tuoi cua ban");

        int tuoi = sn.nextInt();

        if (tuoi < 16) {
            System.out.println("ban o do tuoi vi thanh nien");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("ban o do tuoi truong thanh");
        } else {
            System.out.println("ban da gia :))");
        }
    }
}
