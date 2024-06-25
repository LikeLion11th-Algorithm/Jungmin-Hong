import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";
        StringBuilder sb = new StringBuilder();
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());

        while ((s=br.readLine())!=null) {
            if (s.equals("START")) continue;
            else if (s.equals("END")) {
                List<String> names = new ArrayList<>(map.values());
                for (int i=0; i<names.size(); i++) bw.write(names.get(i)+"\n");
                bw.write("\n");
                map.clear();
            }
            else {
                String[] nw = s.split(" ");
                int weight = Integer.parseInt(nw[2])-Integer.parseInt(nw[1]);
                map.put(weight, nw[0]);
            }
        }

        bw.flush();
        bw.close();
    }
}
