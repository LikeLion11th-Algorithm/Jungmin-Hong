import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> dq = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        String s = "";

        for (int i=0; i<N; i++) {
            s = br.readLine();
            switch (s.charAt(0)) {
                case '1':
                    dq.addFirst(Integer.parseInt(s.substring(2)));
                    break;
                case '2':
                    dq.addLast(Integer.parseInt(s.substring(2)));
                    break;
                case '3':
                    bw.write(dq.isEmpty() ? "-1\n" : dq.remove()+"\n");
                    break;
                case '4':
                    bw.write(dq.isEmpty() ? "-1\n" : dq.removeLast()+"\n");
                    break;
                case '5':
                    bw.write(dq.size()+"\n");
                    break;
                case '6':
                    bw.write(dq.isEmpty() ? "1\n" : "0\n");
                    break;
                case '7':
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peek()+"\n");
                    break;
                case '8':
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekLast()+"\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
    }
}
