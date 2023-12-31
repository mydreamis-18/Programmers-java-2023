class Solution {
    public String solution(String code) {
        //
        // // ㅜ 함수 오타
        // // subString => substring
        // // error: cannot find symbol
        // code.subString(i, 1);
            
        // // ㅜ 스트링 인덱스 벗어남
        // // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 2, end 1, length 11
        // code.substring(i, 1);
        
        // // ㅜ 오류: 호환되지 않는 유형: int를 부울로 변환할 수 없습니다.
        // // error: incompatible types: int cannot be converted to boolean
        // mode = mode ? 1 : 0;
        
        int mode = 0;
        String answer = "";
        
        for (int i = 0; i < code.length(); i++) {
            //
            // // ㅜ 방법1
            // // ㅜ 모드가 0일 때
            // if (mode == 0) {
            //     if (code.substring(i, i + 1).equals("1")) {
            //         mode = 1;
            //     }
            //     else if (i % 2 == 0) {
            //         answer += code.charAt(i);
            //     }
            // }
            // // ㅜ 모드가 1일 때
            // else {
            //     if (code.substring(i, i + 1).equals("1")) {
            //         mode = 0;
            //     }
            //     else if (i % 2 == 1) {
            //         answer += code.charAt(i);
            //     }
            // }
            
            // ㅜ 방법2
            // ㅜ 모드 변경
            if (code.substring(i, i + 1).equals("1")) {
                mode = mode == 0 ? 1 : 0;
            }
            else if (i % 2 == mode) {
                answer += code.charAt(i);
            }
        }
        return answer.equals("") ? "EMPTY" : answer;
    }
}