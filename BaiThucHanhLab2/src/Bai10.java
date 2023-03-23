import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        String chuoi;
        char kytu;
        int count = 0;

        Scanner sn = new Scanner(System.in);
        do {
            System.out.println("nhap vao mot chuoi");
            chuoi = sn.nextLine();
        } while (chuoi.length() > 80);
        System.out.println("nhap vao ky tu");
        kytu = sn.next().charAt(0);

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu)
                count++;
        }
        System.out.println("so lan xuat hien " + kytu + " trong chuoi " + chuoi + " la: " + count);
    }
}
