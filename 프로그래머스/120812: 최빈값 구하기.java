class Solution {
    public int solution(int[] array) {
        // 1. 배열에 숫자별 개수를 센다
        // 2. 반복문을 돌려서 배열 중에 가장 큰 숫자를 가진 값을 찾아낸다.
        // 3. 만약 배열 중 같은 값을 가진 쪽이 더 있다면 -1 반환.
        int[] num = new int[1000];
        int answer = -1;
        int maxnum = 0;
        int count = 0;
        
        for (int i=0; i<array.length; i++) {
            num[array[i]]++;
            answer = i;
        }
        if (array.length == 1){
            return array[0];
        }
        else {
            for (int i=0;i<array.length-1;i++) {
                if (num[array[i]] > num[array[i+1]]){
                    maxnum = num[array[i]];
                 answer = array[i];
                }
                else {
                    maxnum = num[array[i+1]];
                    answer = array[i+1];
                }
            }
        
            for (int i=0; i<1000; i++) {
                if (num[i] == maxnum) {
                    count++;
                }
            }
            if (count != 1) {
                answer = -1;
            }
            return answer;
        }
        
    }
}