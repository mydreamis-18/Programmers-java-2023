class Solution {
    //
    public int calculation(int a, int b) {
        //
        // // ㅜ 오류: 호환되지 않는 유형: double에서 int로 손실이 있는 변환 가능
        // // error: incompatible types: possible lossy conversion from double to int
        // return a * Math.pow(10, Integer.toString(b).length()) + b;
        
        // // ㅜ 방법1-1
        // return a * (int) Math.pow(10, Integer.toString(b).length()) + b;
        
        // ㅜ 방법1-2
        return a * (int) Math.pow(10, (int) Math.log10(b) + 1) + b;
    }
    
    public int solution(int a, int b) {
        //
        // ㅜ 방법1
        int calculationAb = calculation(a, b);
        int doubleAb = 2 * a * b;
        
        return calculationAb >= doubleAb ? calculationAb : doubleAb;
    }
}