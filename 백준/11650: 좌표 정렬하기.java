import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] n = new int[N][2];

        for (int i=0; i<N; i++) {
            String[] str = br.readLine().split(" ");
            n[i][0] = Integer.parseInt(str[0]);
            n[i][1] = Integer.parseInt(str[1]);
        }

        Arrays.sort(n, Comparator.comparingInt(num -> num[1]));
        Arrays.sort(n, Comparator.comparingInt(num -> num[0]));

        for (int i=0; i<N; i++) {
            bw.write(n[i][0] + " " + n[i][1] + "\n");
        }

        bw.flush();
        bw.close();
    }
}