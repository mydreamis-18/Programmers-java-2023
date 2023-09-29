class Solution {
    public int solution(int a, int b, int c) {
        //
        int answer = 0;
        
        // ㅜ 세 숫자가 모두 같다면
        if (a == b && (a + b + c) == a * 3) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (int) (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        // ㅜ 어느 두 숫자만 같다면
        else if (a == b || b == c || a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        // ㅜ 세 숫자가 모두 다르다면
        else {
            answer = a + b + c;
        }
        return answer;
    }
}