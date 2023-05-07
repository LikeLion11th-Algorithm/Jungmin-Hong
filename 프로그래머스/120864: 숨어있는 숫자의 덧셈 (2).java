class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-z]", " ");
        String[] str = my_string.split(" ");
        int answer = 0;
        
        for (int i=0; i<str.length; i++) {
            System.out.println(str[i]);
            if (!str[i].equals("")) answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}