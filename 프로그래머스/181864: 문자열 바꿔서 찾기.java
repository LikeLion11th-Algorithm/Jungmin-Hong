import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        String[] str = myString.split("");
        for (int i=0; i<str.length; i++) {
            if (str[i].equals("A")) str[i]="B";
            else str[i]="A";
        }
        myString = String.join("", str);
        if (myString.indexOf(pat)!=-1) return 1;
        
        return 0;
    }
}