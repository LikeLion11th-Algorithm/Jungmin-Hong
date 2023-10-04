import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> student = new ArrayList<>();

        for (int i=0; i<30; i++) {
            student.add(i+1);
        }

        for (int i=0; i<28; i++) {
            student.remove(Integer.valueOf(sc.nextInt()));
        }

        for (Integer s : student) {
            System.out.println(s);
        }

    }
}
