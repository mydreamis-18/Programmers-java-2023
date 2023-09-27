class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // // ㅜ error: array required, but String found
        // my_string[i];
        
        // // 리턴 값이 스트링인 함수라서 오류 발생
        // // ㅜ error: incompatible types: int cannot be converted to String
        // my_string.length();
        
//         // ㅜ 방법1
//         String answer = "";
        
//         for (int i = 0; i < my_string.length(); i++) {
            
//             if (i >= s && i < s + overwrite_string.length()) {
//                 answer += overwrite_string.charAt(i - s);
//             }
            
//             // if (i < s || i >= s + overwrite_string.length())
//             else {
//                 answer += my_string.charAt(i);
//             }
//         }
//         return answer;
        
        // ㅜ 방법2
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}