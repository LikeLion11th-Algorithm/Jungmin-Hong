import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int n = sc.nextInt();

        String[] str = S.split("");

        System.out.println(str[n-1]);
    }
}
