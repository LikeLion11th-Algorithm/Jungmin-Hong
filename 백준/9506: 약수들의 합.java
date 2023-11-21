import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> div = new ArrayList<>();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num==-1) break;

            int sum=0;
            for (int i=1; i<=num/2; i++) {
                if (num%i==0) {
                    div.add(i);
                    sum += i;
                }
            }
            if (sum==num) {
                bw.write(num + " = ");
                for (int i=0; i<div.size(); i++) {
                    if (i==div.size()-1) bw.write(div.get(i)+"\n");
                    else bw.write(div.get(i)+" + ");
                }
            }
            else bw.write(num + " is NOT perfect.\n");
            div.clear();
        }
        bw.flush();
        bw.close();
    }
}