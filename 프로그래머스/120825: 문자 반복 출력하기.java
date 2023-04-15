class Solution {
    public String solution(String my_string, int n) {
        String[] split = my_string.split("");
        String[] new_string = new String[split.length*n];
        for (int i=0; i<split.length; i++) {
            i = n*i;
            for (int k=0; k<n; k++) {
                new_string[k+i] = split[i/n];                
            }
            i = i/n;
        }
        String answer = String.join("", new_string);
        return answer;
    }
}