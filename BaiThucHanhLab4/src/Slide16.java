import java.util.ArrayList;

public class Slide16 {
    public static void main(String[] args) {
        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("JAVA");
        arrayListString.add("PHP");
        arrayListString.add("C#");
        arrayListString.add("C++");

        System.out.println("Cac phan tu co trong arrListString la: ");
        for (int i = 0; i < arrayListString.size(); i++) {
            System.out.println(arrayListString.get(i) + "\t");
        }
    }
}
