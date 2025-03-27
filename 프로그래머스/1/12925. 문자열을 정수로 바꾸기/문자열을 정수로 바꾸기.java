class Solution {
  public int solution(String s) {
        int answer = 0;
        while (true) {
            try {
                answer = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                System.out.println("숫자가 아닙니다.");
            }
        }
        return answer;
    }
}