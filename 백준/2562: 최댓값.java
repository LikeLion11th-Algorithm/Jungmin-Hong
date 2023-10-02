import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int idx = 0;

        for (int i=0; i<9; i++) {
            int x = sc.nextInt();
            max = Math.max(x,max);
            if (max==x) idx=i+1;
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
