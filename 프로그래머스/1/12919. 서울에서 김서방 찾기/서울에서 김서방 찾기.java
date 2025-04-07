import java.util.*;
import static java.util.Arrays.*;
class Solution {
    public String solution(String[] seoul) {

            List<String> seoulList = asList(seoul);

            return  "김서방은 " + (seoulList.indexOf("Kim")) + "에 있다";
        }
}