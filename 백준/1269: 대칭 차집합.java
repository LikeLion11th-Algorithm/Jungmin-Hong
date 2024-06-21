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

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        String[] s1 = br.readLine().split(" ");
        for (int i=0; i<N; i++) {
            A.add(Integer.parseInt(s1[i]));
        }
        String[] s2 = br.readLine().split(" ");
        for (int i=0; i<M; i++) {
            int n = Integer.parseInt(s2[i]);
            if (A.contains(n)) {
                A.remove(n);
            }
            else B.add(n);
        }
        
        bw.write(A.size()+B.size()+"");
        bw.flush();
        bw.close();
    }
}
