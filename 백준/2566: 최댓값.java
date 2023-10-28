import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] num = new int[9][9];
        int idx1=0, idx2=0, max=-1;
        for (int i = 0; i < 9; i++) {
            String[] s = br.readLine().split(" ");
            for (int k=0; k<9; k++) {
                num[i][k] = Integer.parseInt(s[k]);
                if (num[i][k] > max) {
                    idx1=i+1;
                    idx2=k+1;
                    max=num[i][k];
                }
            }
        }
        System.out.println(max);
        System.out.println(idx1 + " " + idx2);



    }
}