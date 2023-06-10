import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i=0; i<strArr.length; i++) {
            if (strArr[i].indexOf("ad")==-1) answer.add(strArr[i]);
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}