class Solution {
    public int solution(int[] num_list) {
        //
        int 합 = 0;
        int 곱 = 1;
        
        for (int num : num_list) {
            합 += num;
            곱 *= num;
        }
        
        int answer = 곱 < 합 * 합 ? 1 : 0;
        return answer;
    }
}