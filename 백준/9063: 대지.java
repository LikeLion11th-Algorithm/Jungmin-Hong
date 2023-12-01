import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        if (n==1) bw.write("0");
        else {
            int dot[][] = new int[n][2];
            int max_x = -10000;
            int min_x = 10000;
            int max_y = -10000;
            int min_y = 10000;
            for (int i=0; i<n; i++) {
                String[] s = br.readLine().split(" ");
                dot[i][0] = Integer.parseInt(s[0]);
                dot[i][1] = Integer.parseInt(s[1]);
                max_x = Math.max(max_x, dot[i][0]);
                min_x = Math.min(min_x, dot[i][0]);
                max_y = Math.max(max_y, dot[i][1]);
                min_y = Math.min(min_y, dot[i][1]);
            }

            bw.write(String.valueOf(Math.abs((max_x-min_x)*(max_y-min_y))));
        }

        bw.flush();
        bw.close();
    }
}