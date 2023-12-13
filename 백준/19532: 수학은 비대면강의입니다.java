import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        double[] nums = new double[6];
        for (int i=0; i<6; i++) {
            nums[i] = Double.parseDouble(str[i]);
        }
        int x = (int) ((nums[5]-((nums[4]*nums[2])/nums[1]))/(nums[3]-((nums[0]*nums[4])/nums[1])));
        int y = (int) ((nums[2]-(nums[0]*x))/nums[1]);

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
    }
}