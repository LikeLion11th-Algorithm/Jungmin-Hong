import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            q.add(i+1);
        }

        while (q.size()!=1) {
            q.remove();
            q.add(q.remove());
        }

        bw.write(q.remove()+"");
        bw.flush();
        bw.close();
    }
}
