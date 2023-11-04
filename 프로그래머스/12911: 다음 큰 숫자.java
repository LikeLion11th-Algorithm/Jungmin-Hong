class Solution {
    public int solution(int n) {
        int len1 = 0;
        String bin1 = Integer.toBinaryString(n);
            for (int i = 0; i < bin1.length(); i++) {
                if (bin1.charAt(i) == '1') len1++;
            }
        
        while (n < 1000001) {
            int len2 = 0;
            String bin2 = Integer.toBinaryString(++n);
            for (int i = 0; i < bin2.length(); i++) {
                if (bin2.charAt(i) == '1') len2++;
            }
            if (len1 == len2) break;
        }
        return n;
    }
}
