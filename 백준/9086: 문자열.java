import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        for (int i=0; i<n; i++) {
            String S = sc.nextLine();
            String[] str = S.split("");
            System.out.println(str[0]+str[str.length-1]);
        }
    }
}
