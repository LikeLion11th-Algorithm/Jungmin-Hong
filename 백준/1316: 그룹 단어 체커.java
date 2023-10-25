import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int answer = 0;
        for (int i=0; i<n; i++) {
            String[] s = sc.nextLine().split("");
            String alphabet = s[0];
            if (s.length == 1) answer++;
            for (int k=1; k<s.length; k++) {
                if (alphabet.contains(s[k]) && !s[k-1].equals(s[k])) break;
                else alphabet+=s[k];
                if (k==s.length-1) answer++;
            }
        }
        System.out.println(answer);

    }
}