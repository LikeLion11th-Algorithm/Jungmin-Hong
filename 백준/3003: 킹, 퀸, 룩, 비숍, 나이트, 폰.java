import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] num = {1,1,2,2,2,8};
        for (int i=0; i<6; i++) {
            num[i] -= Integer.parseInt(str[i]);
        }
        for (int n:num) System.out.print(n+" ");
    }
}
