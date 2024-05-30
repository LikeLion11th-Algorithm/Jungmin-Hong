import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i=0; i<N; i++) {
            set.add(br.readLine());
        }

        String[] s = set.toArray(new String[0]);
        Arrays.sort(s);
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });


        for (int i=0; i<s.length; i++) {
            bw.write(s[i] + "\n");
        }

        bw.flush();
        bw.close();
    }
}