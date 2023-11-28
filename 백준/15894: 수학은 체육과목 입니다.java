import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long x = Long.parseLong(br.readLine());

        bw.write(String.valueOf(x*4));
        bw.flush();
        bw.close();
    }
}