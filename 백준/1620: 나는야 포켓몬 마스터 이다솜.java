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

        Map<String,String> indexName = new HashMap<>();
        Map<String,String> nameIndex = new HashMap<>();

        for (int i=0; i<N; i++) {
            String name = br.readLine();
            indexName.put(Integer.toString(i+1), name);
            nameIndex.put(name,Integer.toString(i+1));
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<M; i++) {
            String s = br.readLine();
            if (s.matches("-?\\d+(\\.\\d+)?")) {
                sb.append(indexName.get(s)).append("\n");
            }
            else {
                sb.append(nameIndex.get(s)).append("\n");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
