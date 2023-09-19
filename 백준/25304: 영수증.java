import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cost = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++) {
            int price = sc.nextInt();
            int num = sc.nextInt();
            sum += price*num;
        }
        System.out.println(cost==sum ? "Yes" : "No");
    }
}
