import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;

        int sum = Arrays.stream(numbers).sum();
        
        return answer - sum;
    }
}