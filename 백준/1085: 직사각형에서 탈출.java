import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] xywh = br.readLine().split(" ");
        int x = Integer.parseInt(xywh[0]);
        int y = Integer.parseInt(xywh[1]);
        int w = Integer.parseInt(xywh[2]);
        int h = Integer.parseInt(xywh[3]);

        int shorter1 = Math.min(Math.abs(x-w), Math.abs(x));
        int shorter2 = Math.min(Math.abs(y-h), Math.abs(y));

        bw.write(Integer.toString(Math.min(shorter1, shorter2)));
        bw.flush();
        bw.close();
    }
}