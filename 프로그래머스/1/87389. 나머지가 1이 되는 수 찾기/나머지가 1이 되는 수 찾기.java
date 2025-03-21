class Solution {
       public int solution(int n) {
        int answer = 0;
        if (3 <= n && n <= 1000000) {
            for (int x = 2; x < n; x++) {
                if (n % x == 1) {
                    answer = x;
                    break;
                }
            }
        }
        return answer;
    }
}