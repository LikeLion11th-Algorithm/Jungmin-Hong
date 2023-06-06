class Solution {
    public int[] solution(int[] num_list, int n) {
        for (int i=0; i<num_list.length-n; i++) {
            int temp = num_list[num_list.length-1];
            for (int k=num_list.length-1; k>0; k--) {
                num_list[k] = num_list[k-1];
            }
            num_list[0] = temp;
        }
        return num_list;
    }
}