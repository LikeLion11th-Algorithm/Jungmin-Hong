import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> q = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int num = 0;

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            switch (s[0]) {
                case "push":
                    num = Integer.parseInt(s[1]);
                    q.add(num);
                    break;
                case "pop":
                    bw.write(q.isEmpty() ? "-1\n":q.poll()+"\n");
                    break;
                case "size":
                    bw.write(q.size()+"\n");
                    break;
                case "empty":
                    bw.write(q.isEmpty() ? "1\n":"0\n");
                    break;
                case "front":
                    bw.write(q.isEmpty() ? "-1\n" : q.element()+"\n");
                    break;
                case "back":
                    bw.write(q.isEmpty() ? "-1\n" : num+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
