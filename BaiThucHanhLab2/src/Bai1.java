import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap 2 so a va b tu ban phim
        System.out.println("a= ");
        System.out.println("b= ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        // su dung phep tong, hieu, tich, thuong, chia lay du

        float tong, hieu, tich, thuong, chiadu;
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = (float) a / b;
        chiadu = a % b;

        System.out.println("tong = " + tong);
        System.out.println("hieu = " + hieu);
        System.out.println("tich=" + tich);
        System.out.println("thuong=" + thuong);
        System.out.println("chia du=" + chiadu);

        // su dung cac toan tu so sanh

        System.out.println("a = b la:" + (a == b));
        System.out.println("a>b la:" + (a > b));
        System.out.println("a>=b la:" + (a >= b));
        System.out.println("a<b la:" + (a < b));
        System.out.println("a<=b la:" + (a <= b));
        System.out.println("a!=b la:" + (a != b));

    }
}
