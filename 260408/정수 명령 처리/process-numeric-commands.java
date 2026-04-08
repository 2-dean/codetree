import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                s.push(sc.nextInt());
            }
            if (command.equals("pop")) {
                int num = s.pop();
                System.out.println(num);
            }
            if (command.equals("size")) {
                System.out.println(s.size());
            } 
            if (command.equals("empty")) {
                System.out.println(s.isEmpty() ? 1 : 0);
            } 
            if (command.equals("top")) {
                System.out.println(s.peek());
            } 
        }
    }
}