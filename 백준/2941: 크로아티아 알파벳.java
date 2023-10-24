import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int alphabet = 0;

        while (s.contains("c=")) {
            alphabet++;
            s = s.replaceFirst("c="," ");
        }
        while (s.contains("c-")) {
            alphabet++;
            s = s.replaceFirst("c-"," ");
        }
        while (s.contains("dz=")) {
            alphabet++;
            s = s.replaceFirst("dz="," ");
        }
        while (s.contains("d-")) {
            alphabet++;
            s = s.replaceFirst("d-"," ");
        }
        while (s.contains("lj")) {
            alphabet++;
            s = s.replaceFirst("lj"," ");
        }
        while (s.contains("nj")) {
            alphabet++;
            s = s.replaceFirst("nj"," ");
        }
        while (s.contains("s=")) {
            alphabet++;
            s = s.replaceFirst("s="," ");
        }
        while (s.contains("z=")) {
            alphabet++;
            s = s.replaceFirst("z="," ");
        }
        s = s.replaceAll("\\s", "");
        alphabet += s.length();

        System.out.println(alphabet);
    }
}