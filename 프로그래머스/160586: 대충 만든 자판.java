class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i=0; i<targets.length; i++) {
            String[] str = targets[i].split("");
            
            int total = 0;
            for (int k=0; k<str.length; k++) {
                int idx = 100;
                for (int l=0; l<keymap.length; l++) {
                    if (keymap[l].indexOf(str[k])!=-1) {
                        idx = idx>keymap[l].indexOf(str[k]) ? keymap[l].indexOf(str[k]):idx;
                    }
                }
                if (idx==100) {
                    total = -1;
                    break;
                }
                total += idx+1;
            }
            answer[i] = total;
        }
        
        return answer;
    }
}