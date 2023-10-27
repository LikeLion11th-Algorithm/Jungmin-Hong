import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] one = new int[N][M];
        int[][] two = new int[N][M];
        int[][] answer = new int[N][M];
        for (int i=0; i<N; i++) {
            for (int k=0; k<M; k++) {
                one[i][k] = sc.nextInt();
            }
        }
        for (int i=0; i<N; i++) {
            for (int k=0; k<M; k++) {
                two[i][k] = sc.nextInt();
            }
        }

        for (int i=0; i<N; i++) {
            for (int k=0; k<M; k++) {
                answer[i][k] = one[i][k]+two[i][k];
            }
        }
        for (int i=0; i<N; i++) {
            for (int k=0; k<M; k++) {
                System.out.print(answer[i][k]+" ");
            }
            System.out.println();
        }
    }
}