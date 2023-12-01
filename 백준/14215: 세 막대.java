import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] len = br.readLine().split(" ");
        int a = Integer.parseInt(len[0]);
        int b = Integer.parseInt(len[1]);
        int c = Integer.parseInt(len[2]);
        int max = Math.max(Math.max(a, b), c);

        if (max >= (a+b+c-max)) {
            // 제일 길었던 변이 가져야할 길이 = c
            bw.write(Integer.toString((a+b+c-max)*2-1));
        }
        else bw.write(Integer.toString(a+b+c));

        bw.flush();
        bw.close();
    }
}