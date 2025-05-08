import java.util.*;
class Solution {
   public int[] solution(int[] arr) {

        if (arr.length <= 1) return new int[]{-1};

        int minimum = Integer.MAX_VALUE;

        for (int i : arr) {
            if(i < minimum) {
                minimum = i;
            }
        }
       int minValue = minimum;
        return Arrays.stream(arr).filter(d -> d != minValue).toArray();
    }
}