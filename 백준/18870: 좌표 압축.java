import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<Integer> x = new ArrayList<>();


        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(s[i]);
            if (!n.contains(num)) n.add(num);
            x.add(num);
        }
        Collections.sort(n);

        for (int i=0; i<x.size(); i++) {
            bw.write(n.indexOf(x.get(i)) + " ");
        }

        bw.flush();
        bw.close();
    }
}