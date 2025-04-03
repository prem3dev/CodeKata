class Solution {
public int solution(int numb) {
        int answer = 0;
        if(numb != 1) {
            int i = 0;
            long number = (long) numb;
            for (i = 1; number != 1 && i <= 500; i++) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = number * 3 + 1;
                }
                answer = i;
            }
            if (answer == 500) {
                answer = -1;
            }
        }
        return answer;
    }
}