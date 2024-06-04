import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split("");
        Integer[] n = new Integer[s.length];

        for (int i=0; i<s.length; i++) {
            n[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(n, Collections.reverseOrder());


        for (int i=0; i<s.length; i++) {
            bw.write(Integer.toString(n[i]));
        }

        bw.flush();
        bw.close();
    }
}