import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n==1) return;

        int i = 2 ;
        while (n != 1) {
            if (n%i == 0) {
                while (n%i==0) {
                    n /= i;
                    bw.write(i + "\n");
                }
            }
            i++;
        }

        bw.flush();
        bw.close();
    }
}