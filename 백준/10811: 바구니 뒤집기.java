import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = IntStream.rangeClosed(1, n).toArray();

        for (int k=0; k<m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            flip(basket,i,j);
        }

        for (int b:basket) {
            System.out.print(b + " ");
        }
    }

    public static void flip(int[] basket, int i, int j) {
        int[] arr = new int[j-i+1];
        for (int k=0; k<arr.length; k++) {
            arr[k] = basket[--j];
        }
        for (int k=0; k<arr.length; k++) {
            basket[j++] = arr[k];
        }
    }
}
