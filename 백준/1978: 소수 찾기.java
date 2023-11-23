import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num[] = br.readLine().split(" ");

        int answer = 0;
        for (int i=0; i<n; i++) {
            if (isPrime(Integer.parseInt(num[i]))) answer++;
        }

        bw.write(Integer.toString(answer));
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