import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] n = new int[N];

        for (int i=0; i<N; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(n);

        for (int i=0; i<N; i++) {
            bw.write(Integer.toString(n[i]) + "\n");
        }

        bw.flush();
        bw.close();
    }
}