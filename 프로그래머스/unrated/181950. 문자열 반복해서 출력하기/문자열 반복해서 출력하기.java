import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        // // ㅜ str과 n를 왜 못 곱해?
        // // error: bad operand types for binary operator '*'
        // // first type:  String
        // // second type: int
        // System.out.print(str * n);
        
        // // ㅜ 방법1
        // for (int i = 0; i < n; i++) {
        //     System.out.print(str);
        // }
        
        // ㅜ 방법2
        System.out.print(str.repeat(n));
    }
}