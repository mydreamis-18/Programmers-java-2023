class Solution {
    public int solution(int num1, int num2) {
        //
        // // ㅜ 오류: 호환되지 않는 유형: int를 문자열로 변환할 수 없습니다.
        // // error: incompatible types: int cannot be converted to String
        // Integer.parseInt(num1);
        
        // // ㅜ 방법1
        // int answer = (int) ((double) num1 / num2 * 1000);
        
        // ㅜ 방법2
        int answer = num1 * 1000 / num2;
        return answer;
    }
}