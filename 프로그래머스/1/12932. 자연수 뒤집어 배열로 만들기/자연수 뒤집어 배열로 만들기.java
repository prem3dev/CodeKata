import java.util.*;
class Solution {
 public int[] solution(long n) {

          int[] arr = Arrays.stream(Long.toString(n).split("")).mapToInt(d -> Integer.parseInt(d)).toArray();
          int a = arr.length;
          int[] answer = new int[a];
          for (int i = 0; i < a; i++) {
              answer[i] = arr[a -1 -i];
          }
            return answer;
        }
}