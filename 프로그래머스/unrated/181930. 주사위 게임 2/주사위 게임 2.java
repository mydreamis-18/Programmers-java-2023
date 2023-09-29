class Solution {
    public int solution(int a, int b, int c) {
        //
        int answer = 0;
        
        // ㅜ 세 숫자가 모두 같다면
        if (a == b && (a + b + c) == a * 3) {
            answer = sumPow(a, b, c, 3);
        }
        // ㅜ 어느 두 숫자만 같다면
        else if (a == b || b == c || a == c) {
            answer = sumPow(a, b, c, 2);
        }
        // ㅜ 세 숫자가 모두 다르다면
        else {
            answer = sumPow(a, b, c, 1);
        }
        return answer;
    }
    
    public int sumPow(int a, int b, int c, int exponent) {
        //
        if (exponent <= 0) return 1;
        
        return (int) (Math.pow(a, exponent) + Math.pow(b, exponent) + Math.pow(c, exponent)) * sumPow(a, b, c, exponent - 1);
    }
}