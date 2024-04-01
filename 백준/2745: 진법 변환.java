import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = br.readLine().split(" ");
        String N = str[0];
        int B = Integer.parseInt(str[1]);
        int answer = 0;

        for (int i=0; i<N.length(); i++) {
            char c = N.charAt(i);
            int digit;

            if (c >= 'A') { // 알파벳
                digit = c-'A'+10;
            }
            else { // 숫자
                digit = c-'0';
            }

            answer = answer*B+digit;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}