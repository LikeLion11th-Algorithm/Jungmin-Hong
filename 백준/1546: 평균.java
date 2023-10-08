import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        double max = 0;
        double sum = 0;

        for (int i=0; i<n; i++) {
            score[i] = sc.nextInt();
            max = Math.max(max, score[i]);
        }

        for (int i=0; i<n; i++) {
            sum += score[i]/max*100;
        }

        System.out.println(sum/n);
    }
}
