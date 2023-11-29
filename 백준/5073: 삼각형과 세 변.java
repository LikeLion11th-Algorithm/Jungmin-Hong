import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] len = br.readLine().split(" ");
            int a = Integer.parseInt(len[0]);
            int b = Integer.parseInt(len[1]);
            int c = Integer.parseInt(len[2]);
            int max = Math.max(Math.max(a, b), c);

            if (a+b+c==0) break;
            if (max >= (a+b+c-max)) bw.write("Invalid\n");
            else if (a==b && b==c) bw.write("Equilateral\n");
            else if (a==b || b==c || a==c) bw.write("Isosceles\n");
            else bw.write("Scalene\n");
        }

        bw.flush();
        bw.close();
    }
}