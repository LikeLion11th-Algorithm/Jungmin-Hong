import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        int i=0;
        for (char c:s.toCharArray()) {
            if (alphabet[c-'a']==-1) alphabet[c-'a'] = i;
            i++;
        }
        for (int a:alphabet) System.out.print(a+" ");
    }
}
