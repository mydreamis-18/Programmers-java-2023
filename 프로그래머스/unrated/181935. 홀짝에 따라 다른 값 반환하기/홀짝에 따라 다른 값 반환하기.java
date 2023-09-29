class Solution {
    public int solution(int n) {
        //
        int answer = 0;
        
        // ㅜ n이 짝수일 때
        if (n % 2 == 0) {
            for (int i = n; i > 0; i -= 2) {
                answer += Math.pow(i, 2);
            }
        }
        // ㅜ n이 홀수일 때
        else {
            for (int i = n; i > 0; i -= 2) {
                answer += i;
            }
        }
        return answer;
    }
}