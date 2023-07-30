class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for (int i=0; i<nums.length-2; i++) {
            for (int k=i+1; k<nums.length-1; k++) {
                for (int l=k+1; l<nums.length; l++) {
                    if (isPrimeNum(nums[i]+nums[k]+nums[l])) answer++;
                }
            }
        }

        return answer;
    }
    
    public boolean isPrimeNum(int n) {
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}