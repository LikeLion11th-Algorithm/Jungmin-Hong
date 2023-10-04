import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = IntStream.rangeClosed(1, n).toArray(); // 1-n으로 배열 채우는 방법

        for (int idx=0; idx<m; idx++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int tmp = basket[i-1];
            basket[i-1] = basket[j-1];
            basket[j-1] = tmp;
        }
        for (int b : basket) {
            System.out.print(b + " ");
        }
    }
}
