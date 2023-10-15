import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            int r = sc.nextInt();
            String s = sc.nextLine();
            s = s.trim();
            String[] str = s.split("");
            int idx=0;
            for (int l=0; l<str.length; l++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(str[idx]);
                }
                idx++;
            }
            System.out.println();
        }
    }
}
