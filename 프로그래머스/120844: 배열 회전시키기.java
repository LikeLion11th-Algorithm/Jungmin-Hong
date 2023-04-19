class Solution {
    public int[] solution(int[] numbers, String direction) {
        int index = 1;
        if (direction.equals("right")) index = numbers.length-1;
        
        int[] answer = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            if (index == numbers.length) index=0;
            answer[i] = numbers[index++];
        }
        
        
        return answer;
    }
}