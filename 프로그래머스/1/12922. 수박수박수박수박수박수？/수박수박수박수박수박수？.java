class Solution {
    public String solution(int n) {
        StringBuilder builder = new StringBuilder();

        String su = "수";
        String bak = "박";

            for (int i = 1; i <= n/2; i++) {
                builder.append(su).append(bak);
            }
            if (n % 2 != 0) {
                builder.append(su);
            }
        return builder.toString();
    }
}