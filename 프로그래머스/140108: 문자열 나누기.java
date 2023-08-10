class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");
        
        for (int i=0; i<s.length(); i++) {
            String x = str[i];
            int n = 1;
            for (int k=i+1; k<s.length(); k++) {
                if (str[k].equals(x)) n++;
                else n--;
                if (n==0) {
                    answer++;
                    i = k;
                    break;
                }
                if (k==s.length()-1) {
                    return answer+1;
                }
            }
            if (n!=0 && i==s.length()-1) answer++;
        }
        
        return answer;
    }
}