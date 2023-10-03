import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];

        for (int idx=0; idx<m; idx++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int ii=i-1; ii<j; ii++) {
                basket[ii] = k;
            }
        }
        for (int b : basket) {
            System.out.print(b + " ");
        }
    }
}
