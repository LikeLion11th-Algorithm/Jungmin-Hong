class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        if(arr.length == 1) return arr[0];
        
        answer = (arr[0] * arr[1]) / gcd(arr[0], arr[1]);
        if (arr.length > 2) {
            for (int i=2; i<arr.length; i++) {
                answer = (arr[i]*answer)/gcd(arr[i],answer);
            }
        }
        
        return answer;
    }
    
    public int gcd(int x, int y) {
        if (y==0) return x;
        return gcd(y, x%y);
    }
}