import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] x = new int[N];

        for (int i=0; i<N; i++) {
            x[i] = Integer.parseInt(s[i]);
        }

        // 중복 제거 및 정렬하여 숫자의 index 파악
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : x) {
            treeSet.add(num);
        }

        // 각 숫자와 해당 숫자의 index 저장
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int index = 0;
        for (int num : treeSet) {
            indexMap.put(num, index++);
        }

        // 배열 순서대로 숫자의 index를 불러 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (int num : x) {
            sb.append(indexMap.get(num)).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
