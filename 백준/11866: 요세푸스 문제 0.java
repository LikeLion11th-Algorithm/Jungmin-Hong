import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        Queue<Integer> q = new LinkedList<>();
        int idx = 0;

        for (int i=1; i<=N; i++) {
            q.add(i);
        }

        bw.write("<");

        while (!q.isEmpty()) {
            idx++;
            if (idx == K) {
                if (q.size()==1) {
                    bw.write(q.remove()+">");
                    break;
                }
                bw.write(q.remove() + ", ");
                idx = 0;
            }
            else q.add(q.remove());
        }
        bw.flush();
        bw.close();
    }
}
