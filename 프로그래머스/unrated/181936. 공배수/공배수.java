class Solution {
    public int solution(int number, int n, int m) {
        //
        // // ㅜ 방법1
        // int answer = number % n == 0 ? number % m == 0 ? 1 : 0 : 0;
        
        // ㅜ 방법2
        int answer = number % n == 0 && number % m == 0 ? 1 : 0;
        return answer;
    }
}