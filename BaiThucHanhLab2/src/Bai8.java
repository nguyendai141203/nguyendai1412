import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap vao so phan tu");
        int n = sn.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao lan thu " + (i + 1));
            int so = sn.nextInt();
            sum += so;
        }
        System.out.println("tong = " + sum);
        float tb = sum / n;
        System.out.println("tong trung binh cong = " + tb);
    }
}
