class Solution {
    public int[] solution(String s) {
        // 2진 변환 횟수
        int binary = 0;
        // 제거된 0의 개수
        int zero = 0;
        
        while (!s.equals("1")) {
            zero += s.length() - s.replaceAll("0","").length();
            s = s.replaceAll("0","");
            s = Integer.toBinaryString(s.length());
            binary++;
        }
        
        
        return new int[]{binary, zero};
    }
}