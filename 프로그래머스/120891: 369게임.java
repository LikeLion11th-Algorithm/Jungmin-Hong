class Solution {
    public int solution(int order) {
        String str = Integer.toString(order);
        String[] split = str.split("");
        int answer = 0;
        for (int i=0; i<split.length; i++) {
            if (split[i].equals("3")||split[i].equals("6")||split[i].equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}