import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i=0; i<N;i++) {
            String s = br.readLine();
            if (s.charAt(0)=='0') stack.pop();
            else stack.push(Integer.parseInt(s));
        }

        while (!stack.empty()) sum+=stack.pop();

        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}
