import java.util.*;
class Solution {
    public boolean solution(int x) {

        boolean answer = true;
        
       int number = Arrays.stream(String.valueOf(x).split("")).mapToInt(d ->Integer.parseInt(d)).sum();
        
       if (x % number == 0) {
           answer = true;
       } else {
           answer = false;
       }
       
       return answer;
    }
}