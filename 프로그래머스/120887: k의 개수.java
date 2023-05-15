class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String num = Integer.toString(k);
        for (int l=i; l<=j; l++) {
            String s = Integer.toString(l);
            String[] str = s.split("");
            for (int n=0; n<str.length; n++) {
                if (str[n].equals(num)) answer++;
            }
        }
        return answer;
    }
}