import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ");
        String[] answer = myStr.split(" ");
        List<String> list = new ArrayList<>();
        for (String str : answer) if (!str.isEmpty()) list.add(str);
        return list.isEmpty() ? new String[] { "EMPTY" }: list.toArray(new String[0]);
    }
}