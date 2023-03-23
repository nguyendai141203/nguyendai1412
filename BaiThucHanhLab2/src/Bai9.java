import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String chuoi = sn.nextLine();

        int countUpper = 0;
        int countLower = 0;
        int countDigits = 0;

        // quet cac ky tu trong chuoi
        for (int i = 0; i < chuoi.length(); i++) {
            char kytu = chuoi.charAt(i);

            if (Character.isUpperCase(kytu)) {
                countUpper++;
            } else if (Character.isLowerCase(kytu)) {
                countLower++;
            } else if (Character.isDigit(kytu)) {
                countDigits++;
            }
        }
        System.out.println("so ky tu hoa trong chuoi " + chuoi + " la " + countUpper);
        System.out.println("so ky tu thuong trong chuoi " + chuoi + " la " + countLower);
        System.out.println("so so trong chuoi " + chuoi + " la " + countDigits);
    }
}
