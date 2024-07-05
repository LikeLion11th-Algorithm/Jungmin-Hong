import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for (int i=0; i<N; i++) dq.add(i+1);
        int idx = dq.remove();
        bw.write(idx+" ");

        for (int i=1; i<N; i++) {
            int num = Integer.parseInt(s[idx-1]);
            if (num<0) {
                for (int k=-1; k>num; k--) dq.addFirst(dq.removeLast());
                idx = dq.removeLast();
            }
            else {
                for (int k=1; k<num; k++) dq.add(dq.remove());
                idx = dq.remove();
            }
            bw.write(idx+" ");
        }

        bw.flush();
        bw.close();
    }
}
