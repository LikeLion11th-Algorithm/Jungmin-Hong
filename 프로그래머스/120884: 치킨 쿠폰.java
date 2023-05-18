class Solution {
    public int solution(int chicken) {
        int answer = chicken/10;
        int left = chicken%10 + answer%10 + answer/10;
        System.out.println(left);
        answer += answer/10;
        
        while (left >= 10) {
            answer += left/10;
            left = left%10 + left/10;
        }
        return answer;
    }
}