import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N%5 == 0) bw.write(Integer.toString(N/5));
        else {
            int k = 0;
            while (N>0) {
                N -= 3;
                k++;

                if (N%5==0) {
                    bw.write(Integer.toString(k+N/5));
                    break;
                }
                else if (N==1 || N==2) {
                    bw.write("-1");
                    break;
                }
            }
        }

        bw.flush();
        bw.close();
    }
}