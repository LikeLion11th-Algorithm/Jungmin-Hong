import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")) {
                set.add(s[0]);
            }
            else if (s[1].equals("leave")) {
                set.remove(s[0]);
            }
        }

        ArrayList<String> answer = new ArrayList<>(set);

        Collections.sort(answer, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : answer) {
            sb.append(name).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
