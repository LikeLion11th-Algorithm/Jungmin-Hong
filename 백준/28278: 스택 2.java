import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N;i++) {
            String s = br.readLine();
            switch (s.charAt(0)) {
                case '1':
                    stack.push(Integer.parseInt(s.substring(2)));
                    break;
                case '2':
                    bw.write(stack.empty() ? "-1\n":stack.pop()+"\n");
                    break;
                case '3':
                    bw.write(stack.size()+"\n");
                    break;
                case '4':
                    bw.write(stack.empty()?"1\n":"0\n");
                    break;
                case '5':
                    bw.write(stack.empty() ? "-1\n":stack.peek()+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
