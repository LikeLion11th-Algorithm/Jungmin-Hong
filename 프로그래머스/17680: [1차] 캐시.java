import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        for (String city:cities) {
            city = city.toLowerCase();
            
            if (cache.contains(city)) {
                cache.remove(city);
                answer += 1;
            }
            else if (!cache.isEmpty() && cache.size()==cacheSize) {
                cache.remove(cache.get(0));
                answer += 5;
            }
            else {
                answer += 5;
            }
            if (cache.size()<cacheSize) cache.add(city);
        }
        
        return answer;
    }
}