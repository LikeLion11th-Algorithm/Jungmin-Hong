import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = new String[5];
        int[] len = new int[5];
        int max_len = 0;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<5; i++) {
            s[i] = br.readLine();
            String[] str = s[i].split("");
            len[i] = str.length;
            max_len = max_len<len[i]? len[i]:max_len;
        }
        for (int i=0; i<max_len; i++) {
            for (int k=0; k<5; k++) {
                if (len[k]>i) {
                    sb.append(s[k].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}