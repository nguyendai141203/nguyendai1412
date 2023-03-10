import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so luong phan tu > 0:");
            n = sc.nextInt();
        } while (n <= 0);
        int arrA[] = new int[n];
        int lengthA = arrA.length;
        System.out.println("Nhap phan tu vao mang:");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = ", i);
            arrA[i] = sc.nextInt();
        }
        // cac phan tu hien tai
        System.out.println("Danh sach cac phan tu :");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = %d\t", i, arrA[i]);
        }
        // sap xep cac phan tu tang dan
        for (int i = 0; i < lengthA - 1; i++) {
            for (int j = i + 1; j < lengthA; j++) {
                if (arrA[i] > arrA[j]) {
                    int tmp = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = tmp;
                }
            }
        }
        // cac phan tu da dc sap xep
        System.out.println("");
        System.out.println("Cac phan tu da duoc sap xep :");
        for (int i = 0; i < lengthA; i++) {
            System.out.printf("A[%d] = %d\t", i, arrA[i]);
        }

    }
}