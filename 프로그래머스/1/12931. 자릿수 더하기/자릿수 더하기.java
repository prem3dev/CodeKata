import java.util.*;

public class Solution {
    public int solution(int n) {
int answer = 0;
answer = Arrays.stream(Integer.toString(n).split("")).mapToInt(d -> Integer.parseInt(d)).sum();
return answer;
  }
}