import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거
        String s = sc.nextLine();
        String[] str = s.split("");
        int sum = 0;
        for (int i=0; i<n; i++) {
            sum += Integer.parseInt(str[i]);
        }
        System.out.println(sum);
    }
}
