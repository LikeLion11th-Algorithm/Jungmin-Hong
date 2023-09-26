import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            // 공백 (총 개수-(i+1))
            for (int k=0; k<n-i-1; k++) {
                bw.write(" ");
            }
            for (int k=0; k<=i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
