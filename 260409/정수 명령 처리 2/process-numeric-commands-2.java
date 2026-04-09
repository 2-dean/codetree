import java.util.*;

public class Main {
    // 큐 구현하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Queue<Integer> q = new LinkedList<>();
    
        for(int i = 0 ; i < n ; i++) {
            String command = sc.next();
            if (command.equals("push")) {
                int num = sc.nextInt();
                q.add(num);
            }
            if (command.equals("pop")) {
                System.out.println(q.poll());
            }
            if (command.equals("size")) {
                System.out.println(q.size());
            }
            if (command.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            if (command.equals("front")) {
                System.out.println(q.peek());
            }
        }
    }
}