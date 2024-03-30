import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[5];

        for (int i=0; i<5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);
        bw.write(Integer.toString(Arrays.stream(num).sum()/5)+"\n");
        bw.write(Integer.toString(num[2]));

        bw.flush();
        bw.close();
    }
}