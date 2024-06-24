import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        Set<String> set = new HashSet<>();

        int n=s.length();
        while (n!=0) {
            for (int i=0; i<s.length()-n+1; i++) {
                set.add(s.substring(i,n+i));
            }
            n--;
        }

        bw.write(set.size()+"");
        bw.flush();
        bw.close();
    }
}
