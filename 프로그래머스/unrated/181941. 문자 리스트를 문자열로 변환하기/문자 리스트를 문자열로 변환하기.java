class Solution {
    public String solution(String[] arr) {
        //
        // // ㅜ 임포트 안 해줘서 에러 발생 => import java.util.Arrays;
        // // ㅜ error: cannot find symbol
        // String answer = Arrays.toString(arr);
        
        // // ㅜ error: no suitable method found for join(String[],String)
        // String answer = String.join(arr, "");
        
        String answer = String.join("", arr);
        return answer;
    }
}