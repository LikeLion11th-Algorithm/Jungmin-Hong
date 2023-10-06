import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> left = new HashSet<>();

        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            left.add(n%42);
        }
        System.out.println(left.size());
    }
}
