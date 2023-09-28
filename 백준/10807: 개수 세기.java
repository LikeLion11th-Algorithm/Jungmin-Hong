import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            arr.add(sc.nextInt());
        }
        int v = sc.nextInt();

        System.out.println(Collections.frequency(arr, v));
    }
}
