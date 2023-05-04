class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i=0; i<array.length; i++) {
            String[] str = Integer.toString(array[i]).split("");
            for (int k=0; k<str.length; k++) {
                if (str[k].equals("7")) answer++;
            }
        }
        
        return answer;
    }
}