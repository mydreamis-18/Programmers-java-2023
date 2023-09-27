class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        // // ㅜ error: array required, but String found
        // my_string[i];
        
        // // 리턴 값이 스트링인 함수라서 오류 발생
        // // ㅜ error: incompatible types: int cannot be converted to String
        // my_string.length();
        
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            
            if (i >= s && i < s + overwrite_string.length()) {
                answer += overwrite_string.charAt(i - s);
            }
            
            // if (i < s || i >= s + overwrite_string.length())
            else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}