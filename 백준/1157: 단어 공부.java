import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toUpperCase().toCharArray();
        int[] alphabet = new int[26];
        int max=0;
        int max_char=0;
        for (char c:str) {
            alphabet[c-'A']++;
        }
        for (int i=0; i<alphabet.length; i++) {
            if (alphabet[i]>max) {
                max = alphabet[i];
                max_char = 'A'+i;
            }
            else if (alphabet[i]==max) {
                max_char = '?';
            }
        }
        System.out.println((char)max_char);

    }
}