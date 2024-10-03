import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {        
        int[] video = Arrays.stream(video_len.split(":"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] position = Arrays.stream(pos.split(":"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] ops = Arrays.stream(op_start.split(":"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] ope = Arrays.stream(op_end.split(":"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        
        int ops_t = ops[0]*60+ops[1];
        int ope_t = ope[0]*60+ope[1];
        int v_t = video[0]*60+video[1];
        
        for (String c : commands) {
            int p_t = position[0]*60+position[1];
            if (c.equals("prev")) {
                // 00:00보다 작을 경우 고려
                // 오프닝 구간 안에 들어갈 경우, 오프닝 끝나는 위치로 이동
                if (p_t <= ope_t && 
                    p_t >= ops_t) {
                    p_t = ope_t;
                }
                else {
                    p_t = p_t-10<0 ? 0:p_t-10;
                    if (p_t <= ope_t && 
                        p_t >= ops_t) {
                        p_t = ope_t;
                    }
                }
                position[0] = p_t/60;
                position[1] = p_t%60;
            }
            else {
                // 비디오 끝나는 시간보다 커질 경우 고려
                // 오프닝 구간 안에 들어갈 경우, 오프닝 끝나는 위치로 이동
                
                if (p_t <= ope_t && 
                    p_t >= ops_t) {
                    p_t = ope_t;
                }
                
                p_t = p_t+10>v_t?v_t:p_t+10;
                if (p_t <= ope_t && 
                    p_t >= ops_t) {
                    p_t = ope_t;
                }
                else if (p_t>v_t) {
                    p_t=v_t;
                }
                position[0] = p_t/60;
                position[1] = p_t%60;
            }
        }
        String answer = String.format("%02d",position[0]) + ":" + String.format("%02d",position[1]);
        return answer;
    }
}