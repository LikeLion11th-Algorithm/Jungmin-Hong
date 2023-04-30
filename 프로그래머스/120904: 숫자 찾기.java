class Solution {
    public int solution(int num, int k) {
        String number = Integer.toString(num);
        String[] str = number.split("");
        int answer = -1;
        for (int i=0; i<str.length; i++) {
            if (Integer.parseInt(str[i]) == k) {
                answer = i+1;
                break;
            }
        }
        
        
        return answer;
    }
}