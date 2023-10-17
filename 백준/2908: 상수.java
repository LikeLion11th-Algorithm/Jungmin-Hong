import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int A = 0;
        int B = 0;
        for (int i=0; i<3; i++) {
            A = A*10 + a%10;
            B = B*10 + b%10;
            a /= 10;
            b /= 10;
        }
        System.out.println(A>B ? A:B);
    }
}
