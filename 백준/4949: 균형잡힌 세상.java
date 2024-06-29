import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        Stack<String> stack = new Stack<>();
        boolean tf = true;

        while (!(input=br.readLine()).equals(".")) {
            String[] sen = input.split("");
            tf = true;
            for (String s:sen) {
                if (s.equals("(")) stack.push("(");
                else if (s.equals(")") && !stack.empty() && stack.peek()=="(") stack.pop();
                else if (s.equals("[")) stack.push("[");
                else if (s.equals("]") && !stack.empty() && stack.peek()=="[") stack.pop();
                else if (s.equals(")") || s.equals("]")) {
                    tf = false;
                    break;
                }
            }
            if (stack.empty() && tf) bw.write("yes\n");
            else {
                bw.write("no\n");
                stack.clear();
            }
        }
        bw.flush();
        bw.close();
    }
}
