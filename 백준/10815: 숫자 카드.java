import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s1 = br.readLine().split(" ");
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<N; i++) {
            set.add(Integer.parseInt(s1[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] s2 = br.readLine().split(" ");
        Integer[] m = new Integer[M];
        for (int i=0; i<M; i++) {
            m[i] = Integer.parseInt(s2[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer num : m) {
            sb.append(set.contains(num) ? 1:0).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
