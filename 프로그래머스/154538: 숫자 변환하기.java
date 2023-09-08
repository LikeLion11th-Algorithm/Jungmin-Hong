class Solution {
    public int solution(int x, int y, int n) {
        int answer = -1;
        
        if (y%x==0 && (y/x)%2==0) {
            answer = (y/x)/2;
            System.out.println("2");
        }
        if (y%x==0 && (y/x)%3==0) {
            if (answer==-1) answer = (y/x)/3;
            else answer = answer<(y/x)/3 ? answer:(y/x)/3;
            System.out.println("3");
        }
        if ((y-x)%n==0) {
            if (answer==-1) answer = (y-x)/n;
            else answer = answer<(y-x)/n ? answer:(y-x)/n;
            System.out.println("n");
        }
                
        return answer;
    }
}