import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        List<Integer> numbs = new ArrayList<>();
        for (int i = 0; i < absolutes.length; i++) {

            if (!signs[i]) {
                numbs.add(-absolutes[i]);
            } else {
                numbs.add(absolutes[i]);
            }
        }
            IntStream intStream = numbs.stream().mapToInt(Integer::intValue);

            return intStream.sum();
        }
}