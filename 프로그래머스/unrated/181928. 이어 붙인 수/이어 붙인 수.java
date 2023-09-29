class Solution {
    public int solution(int[] num_list) {
        //
//         // ㅜ 방법1
//         String odd = "", even = "";
        
//         for (int num : num_list) {
//             if (num % 2 == 0) {
//                 even += num;
//             }
//             else {
//                 odd += num;
//             }
//         }
        
//         int answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        // ㅜ 방법2
        int odd = 0, even = 0;
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                even *= 10;
                even += num;
            }
            else {
                odd *= 10;
                odd += num;
            }
        }
        
        int answer = odd + even;
        return answer;
    }
}