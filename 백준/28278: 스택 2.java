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
                    String[] x1 = s.split(" ");
                    stack.push(Integer.parseInt(x1[1]));
                    break;
                case '2':
                    if (!stack.empty()) {
                        bw.write(stack.pop()+"\n");
                    }
                    else bw.write("-1\n");
                    bw.flush();
                    break;
                case '3':
                    bw.write(stack.size()+"\n");
                    bw.flush();
                    break;
                case '4':
                    bw.write(stack.empty()?"1\n":"0\n");
                    bw.flush();
                    break;
                case '5':
                    if (!stack.empty()) {
                        bw.write(stack.peek()+"\n");
                    }
                    else bw.write("-1\n");
                    bw.flush();
                    break;
            }
        }
        bw.close();
    }
}
