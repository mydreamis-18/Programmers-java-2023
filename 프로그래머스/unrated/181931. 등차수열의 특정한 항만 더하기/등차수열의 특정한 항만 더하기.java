class Solution {
    public int solution(int a, int d, boolean[] included) {
        //
        // // ㅜ error: cannot find symbol
        // included.length();
        
        int answer = 0;
        
        for (int i = 0; i < included.length; i++) {
            //
            if (included[i]) {
                // ㅜ 등차수열
                answer += a + i * d;
            }
        }
        return answer;
    }
}