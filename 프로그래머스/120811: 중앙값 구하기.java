class Solution {
    // 테스트 케이스 9번 실패..
    public int solution(int[] array) {
        int num = array.length / 2;
        int[] answer = new int[array.length];
        // 숫자 하나씩 선택해 자기보다 큰 숫자가 있는지 센다. -> 4개 = 전체 길이 5-4-1의 자리에 위치
        for (int i=0; i<array.length; i++) {
            int bigger = 0;
            for (int n=0; n<array.length; n++) {
                if (i == n) 
                    continue;
                else if (array[i] < array[n]) {
                    bigger += 1;
                }
            }
            int index = array.length - bigger - 1;
            answer[index] = array[i];
        }
        return answer[num];
    }
}