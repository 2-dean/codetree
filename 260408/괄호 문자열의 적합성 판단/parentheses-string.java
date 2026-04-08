import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<Character> s = new Stack<>();
        // Please write your code here.
        for (int i = 0 ; i< str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push('(');
            } else { // ) 나왔을때
                if (s.isEmpty()) {
                     System.out.print("No");
                }
                s.pop();
            }
        }

        if (!s.isEmpty()){
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }


    }
}