import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;
        for (int i=M; i<=N; i++) {
            if (isPrime(i)) {
                sum += i;
                min = i<min? i:min;
            }
        }
        if (sum==0) bw.write("-1");
        else bw.write(sum + "\n" + min);
        bw.flush();
        bw.close();
    }
    public static boolean isPrime(int n) {
        if (n==1) return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}