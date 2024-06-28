import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        boolean tf = true;

        for (int i=0; i<N;i++) {
            String[] brackets = br.readLine().split("");
            for (String b:brackets) {
                if (b.equals("(")) stack.push("(");
                else if (stack.empty()){
                    tf = false;
                    break;
                }
                else stack.pop();
            }
            if (tf && stack.empty()) bw.write("YES\n");
            else {
                bw.write("NO\n");
                stack.clear();
            }
            tf = true;
        }

        bw.flush();
        bw.close();
    }
}
