import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n[] = br.readLine().split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(n[0]);
        int idx = Integer.parseInt(n[1]);
        int k=0;

        for (int i=1; i<=num; i++) {
            if (num%i==0) k++;
            if (k==idx) {
                bw.write(String.valueOf(i));
                break;
            }
            if (i==num) bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}