import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Person[] p = new Person[N];

        for (int i=0; i<N; i++) {
            String[] s = br.readLine().split(" ");
            p[i] = new Person(Integer.parseInt(s[0]), s[1]);
        }

        // 정렬하는 기준을 변경하는 방법
        Arrays.sort(p, new Comparator<Person>() {

            @Override
            public int compare(Person p1, Person p2) {
                return p1.age - p2.age;
            }

        });

        for (int i=0; i<N; i++) {
            bw.write(p[i].age + " " + p[i].name + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
}