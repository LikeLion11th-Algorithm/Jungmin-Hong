class Solution {
    public String solution(int a, int b) {
        String days[] = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dates = 0;
        
        for (int i=1; i<a; i++) {
            dates += month[i-1];
        }
        dates += b-1;
        
        return days[dates%7];
    }
}