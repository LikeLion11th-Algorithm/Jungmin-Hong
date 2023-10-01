import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int x = sc.nextInt();

        for (int i=0; i<n; i++) {
            int a = sc.nextInt();
            if (a<x) bw.write(a + " ");
        }

        bw.close();
    }
}
