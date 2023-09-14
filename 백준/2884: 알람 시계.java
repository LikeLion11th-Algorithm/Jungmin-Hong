import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        int time = h*60 + m - 45;
        if (time<0) {
            h = 23;
            m = 60+time;
        }
        else {
            h = time/60;
            m = time%60;
        }

        System.out.println(h + " " + m);

    }
}
