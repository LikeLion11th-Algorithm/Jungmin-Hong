class Solution {
    public int solution(int[] diffs, int[] times, long limit) {        
        // level 조정을 위한 값
        long less = 1;
        long more = limit;
        long level = 0;
        
        while (less<more) {
            long time = 0;
            long tmp = 0;
            level = (less+more)/2;
            for (int i=0; i<diffs.length; i++) {
                int d = diffs[i];
                int t = times[i];
                if (d<=level) tmp = t;
                else tmp = (d-level)*(t+times[i-1]) +t;
                time += tmp;
            }
            if (limit < time) less = level+1;
            else more = level;
        }
        
        return (int) less;
    }
}