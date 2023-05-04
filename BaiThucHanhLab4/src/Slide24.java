import java.util.ArrayList;
import java.util.Scanner;

public class Slide24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListIntegers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i +": ");
            number = scanner.nextInt();
            arrListIntegers.add(number);
        }
        int max = arrListIntegers.get(0);

        for( int i = 1; i < arrListIntegers.size(); i++) {
            if (arrListIntegers.get(i).compareTo(max) > 0) {
                max = arrListIntegers.get(i);
            }
        }

        int min = arrListIntegers.get(0);

        for( int i = 1; i < arrListIntegers.size(); i++) {
            if (arrListIntegers.get(i).compareTo(min) < 0) {
                min = arrListIntegers.get(i);
            }
        }
    System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
    System.out.println("Phan tu nho nhat trong arrListInteger = " + min);
    }
}