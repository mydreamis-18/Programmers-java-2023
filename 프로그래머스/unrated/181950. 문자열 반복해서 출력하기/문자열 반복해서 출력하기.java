import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        // str과 n를 왜 못 곱해?
        // System.out.print(str * n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}