import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] card = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");

        Map<String,Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            if (!map.containsKey(card[i])) {
                map.put(card[i],1);
            }
            else {
                int n = map.get(card[i]);
                map.put(card[i],n+1);
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            if (map.containsKey(num[i])) sb.append(map.get(num[i])).append(" ");
            else sb.append("0 ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
