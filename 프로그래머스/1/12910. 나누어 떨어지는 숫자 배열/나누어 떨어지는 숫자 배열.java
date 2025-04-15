import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        List<Integer> result = new ArrayList<Integer>();
        
        for(int num : arr) {
            if(num % divisor == 0) result.add(num);
        }
        
        if(result.size() != 0) {
            answer = new int[result.size()];

            for(int i=0; i<result.size(); i++){
                answer[i] = result.get(i);
            }

            Arrays.sort(answer);  
        }
        
        return answer;
    }
}