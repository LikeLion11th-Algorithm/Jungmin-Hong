import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i=0; i<N;i++) {
            String[] brackets = br.readLine().split("");
            answer = 0;

            for (String b:brackets) {
                if (b.equals("(")) answer++;
                else answer--;

                if (answer < 0) {
                    bw.write("NO\n");
                    break;
                }
            }

            if (answer == 0) bw.write("YES\n");
            else if (answer > 0) bw.write("NO\n");
        }

        bw.flush();
        bw.close();
    }
}
