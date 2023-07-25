class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++) {
            for (int k=0; k<food[i]/2; k++) {
                answer += Integer.toString(i);
            }
        }
        StringBuilder sb = new StringBuilder(answer).reverse();
        answer += Integer.toString(0) + sb.toString();
        return answer;
    }
}