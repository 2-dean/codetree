import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n ; i++) {
            if (i + 1 < n && s.charAt(i) == '(' && s.charAt(i+1) == '(' ) {
                for (int k = i + 2; k < n -1; k ++) {
                    if (s.charAt(k) == ')' && s.charAt(k + 1) == ')' ) {
                    count++;
                    }
                }
                     
            }
        }
        System.out.print(count);
    }
}