import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int k = N-Integer.parseInt(str[1]);
        int score = 0;

        int s[] = new int[N];
        String x[] = br.readLine().split(" ");

        for (int i=0; i<N; i++) {
            s[i] = Integer.parseInt(x[i]);
        }

        Arrays.sort(s);

        bw.write(String.valueOf(s[k]));
        bw.flush();
        bw.close();
    }
}