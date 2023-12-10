import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int dot[][] = new int[3][2];
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();


        for (int i=0; i<3; i++) {
            String[] s = br.readLine().split(" ");
            dot[i][0] = Integer.parseInt(s[0]);
            dot[i][1] = Integer.parseInt(s[1]);

            if (xList.contains(dot[i][0])) xList.remove(xList.indexOf(dot[i][0]));
            else xList.add(dot[i][0]);

            if (yList.contains(dot[i][1])) yList.remove(yList.indexOf(dot[i][1]));
            else yList.add(dot[i][1]);
        }

        bw.write(xList.get(0) + " " + yList.get(0));

        bw.flush();
        bw.close();
    }
}