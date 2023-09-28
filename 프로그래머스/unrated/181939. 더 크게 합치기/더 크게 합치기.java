class Solution {
    //
    public int calculation(int a, int b) {
        return a * (int) Math.pow(10, Integer.toString(b).length()) + b;
    }
    
    public int solution(int a, int b) {
        //
        // // ㅜ int => string 시 에러 발생
        // // error: int cannot be dereferenced
        // a.toString();

        // // ㅜ 방법1
        // int ab = calculation(a, b);
        // int ba = calculation(b, a);
        
        // ㅜ 방법2
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);
        
        return ab >= ba ? ab : ba;
    }
}