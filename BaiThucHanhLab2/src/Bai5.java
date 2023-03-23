import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int a, b = 0;
        Scanner sn = new Scanner(System.in);
        do {
            System.out.println("nhap vao so nguyen");
            a = sn.nextInt();
            b += a;
            if (b > 100)
                break;
        } while (a > 0);
        System.out.println("tong = " + b);
    }
}
