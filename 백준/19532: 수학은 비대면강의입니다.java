import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        double[] nums = new double[6];
        double a = Double.parseDouble(str[0]);
        double b = Double.parseDouble(str[1]);
        double c = Double.parseDouble(str[2]);
        double d = Double.parseDouble(str[3]);
        double e = Double.parseDouble(str[4]);
        double f = Double.parseDouble(str[5]);

        int x = (int) ((c*e - b*f)/(a*e - b*d));
        int y = (int) ((c*d - a*f)/(b*d - a*e));

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}