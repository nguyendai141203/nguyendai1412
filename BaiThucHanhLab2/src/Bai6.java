import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen bat ky");
        int a = sn.nextInt();
        int giaithua = 1;
        for (int i = 1; i <= a; i++) {
            giaithua *= i;
        }
        System.out.println("giai thua = " + giaithua);
    }
}
