import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);
        int answer = 0;

        Set<String> set = new HashSet<>();

        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }

        for (int i=0; i<M; i++) {
            answer += set.contains(br.readLine()) ? 1 : 0;
        }

        bw.write(""+answer);
        bw.flush();
        bw.close();
    }
}
