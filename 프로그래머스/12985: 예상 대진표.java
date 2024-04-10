class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // +1 /2, AB 중 큰 애가 짝수
        while (n>1) {
            answer++;
            if (a-b == 1 || b-a == 1) {
                if (a>b && a%2==0 || a<b && b%2==0) break;
            }
            a = (a+1)/2;
            b = (b+1)/2;
        }

        return answer;
    }
}