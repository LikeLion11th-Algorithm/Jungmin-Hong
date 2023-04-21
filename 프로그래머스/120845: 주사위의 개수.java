class Solution {
    public int solution(int[] box, int n) {
        int hl = box[0]/n;
        int vl = box[1]/n;
        int h = box[2]/n;
        
        return hl*vl*h;
    }
}