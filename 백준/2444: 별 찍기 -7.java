import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int n = Integer.parseInt(br.readLine());
        for (int i=1; i<=n; i++) {
            for (int k=0; k<n-i; k++) bw.write(" ");
            for (int k=0; k<i*2-1; k++) bw.write("*");
            bw.write("\n");
        }
        for (int i=n-1; i>=1; i--) {
            for (int k=0; k<n-i; k++) bw.write(" ");
            for (int k=0; k<i*2-1; k++) bw.write("*");
            bw.write("\n");
        }
        bw.close();
    }
}