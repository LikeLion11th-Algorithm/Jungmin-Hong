import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> arr = new ArrayList<String>();
        
        String[] answer = {};
        
        for (int i=0; i<picture.length; i++) {
            String str = "";
            String[] pic = picture[i].split("");
            for (String s : pic) {
                for (int n=0; n<k; n++) str += s;
            }
            for (int n=0; n<k; n++) {
                arr.add(str);
            }
        }
        
        return arr.toArray(new String[arr.size()]);
    }
}