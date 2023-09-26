import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // // ㅜ error: not a statement
        // a[i];
        
        String result = new String();
        for (char 한글자 : str.toCharArray()) {
            //
            if (Character.isLowerCase(한글자)) {
                result += Character.toUpperCase(한글자);
            }
            else {
                result += Character.toLowerCase(한글자);
            }
        }
        System.out.print(result);
    }
}