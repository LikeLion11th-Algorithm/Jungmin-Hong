class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int maxnum = 0;
        int[] count = new int[1000];
        int num = 0;
        
        // 1. 배열에 숫자별 개수를 센다
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++;
            
            // 2. 그 중에 원래보다 개수가 많아진 것이 생기면 교체
            if(maxnum < count[array[i]]) {
                maxnum = count[array[i]];
                answer = array[i];
            }
        }
        
        // 3. 만약 배열 중 같은 값을 가진 쪽이 더 있다면 -1 반환.
        for(int i = 0; i < 1000; i++) {
            if(maxnum == count[i]) num++;
            if(num > 1) {
                answer = -1; 
                break;
            }
        }
        
        return answer;
        
    }
}