import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=1, b=1;
        while (true) {
            String num[] = br.readLine().split(" ");

            a = Integer.parseInt(num[0]);
            b = Integer.parseInt(num[1]);
            if (a+b==0) break;

            if (b % a == 0) System.out.println("factor");
            else if (a % b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}