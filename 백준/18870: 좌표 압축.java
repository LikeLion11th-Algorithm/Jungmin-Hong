import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        ArrayList<Integer> x = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i=0; i<N; i++) {
            int num = Integer.parseInt(s[i]);
            treeSet.add(num);
            x.add(num);
        }

        for (int i=0; i<x.size(); i++) {
            bw.write(treeSet.headSet(x.get(i)).size() + " ");
        }

        bw.flush();
        bw.close();
    }
}