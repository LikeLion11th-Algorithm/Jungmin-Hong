import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        Set<String> heardx = new HashSet<>();
        Set<String> seenx = new TreeSet<>();

        for (int i=0; i<N; i++) {
            heardx.add(br.readLine());
        }
        for (int i=0; i<M; i++) {
            String name = br.readLine();
            if (heardx.contains(name)) {
                seenx.add(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(seenx.size()+"\n");
        String[] s = seenx.toArray(new String[0]);
        for (int i=0; i<s.length; i++) {
            sb.append(s[i]).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
