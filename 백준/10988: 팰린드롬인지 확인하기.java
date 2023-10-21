import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
        String str = br.readLine();
        String answer = "";
        for (String s:str.split("")) {
            answer = s+answer;
        }
        System.out.println(answer.equals(str)? 1:0);
    }
}