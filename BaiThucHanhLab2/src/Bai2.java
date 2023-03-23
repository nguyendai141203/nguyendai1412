import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap vao mot so la:");
        int a = sn.nextInt();

        if (a % 2 == 0) {
            System.out.println("so vua nhap la so chan");
        } else {
            System.out.println("so vua nhap la so le");
        }
    }
}
