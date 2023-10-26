import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double gpa = 0;
        double credit = 0;
        for (int i=0; i<20; i++) {
            String[] major = br.readLine().split(" ");
            double c = Double.parseDouble(major[1]);
            if (!major[2].equals("P")) credit += c;
            switch (major[2]) {
                case "A+":
                    gpa += c*4.5;
                    break;
                case "A0":
                    gpa += c*4.0;
                    break;
                case "B+":
                    gpa += c*3.5;
                    break;
                case "B0":
                    gpa += c*3.0;
                    break;
                case "C+":
                    gpa += c*2.5;
                    break;
                case "C0":
                    gpa += c*2.0;
                    break;
                case "D+":
                    gpa += c*1.5;
                    break;
                case "D0":
                    gpa += c*1.0;
                    break;
            }
        }
        System.out.println(gpa/credit);
    }
}