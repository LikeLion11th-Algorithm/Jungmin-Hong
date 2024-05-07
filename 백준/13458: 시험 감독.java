import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long answer = 0;

        // 시험장 개수
        long N = Long.parseLong(br.readLine());

        // 시험장 별 응시생
        String[] a = br.readLine().split(" ");
        long[] A = new long[a.length];
        for (int i=0; i<N; i++) A[i] = Long.parseLong(a[i]);

        // B = 총 감독관 감시, C = 부 감독관 감시
        String[] bc = br.readLine().split(" ");
        int B = Integer.parseInt(bc[0]);
        int C = Integer.parseInt(bc[1]);

        for (int i=0; i<N; i++) {
            // (응시생 - 총 감독관)/부 감독관 나누어떨어지면 그대로, 나머지가 생기면 + 1
            answer++;
            long num = A[i]-B;
            if (num<=0) continue; // break 사용 시, for 문을 뛰어넘으므로 주의
            else if (num%C == 0) answer += num/C;
            else answer += num/C+1;
        }

        bw.write(Long.toString(answer));

        bw.flush();
        bw.close();
    }
}