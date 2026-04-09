import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n ; i ++) {
            String command = sc.next();
            if (command.equals("push_front")) {
                int num = sc.nextInt();
                dq.addFirst(num);
            }
            if (command.equals("push_back")) {
                int num = sc.nextInt();
                dq.addLast(num);
            }
            if (command.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            }
            if (command.equals("pop_back")) {
                System.out.println(dq.pollLast());
            }
            if (command.equals("size")) {
                System.out.println(dq.size());
            }
            if (command.equals("empty")) {
                System.out.println(dq.isEmpty() ? 1 : 0);
            }
            if (command.equals("front")) {
                System.out.println(dq.peekFirst());
            }
            if (command.equals("back")) {
                System.out.println(dq.peekLast());
            }
        }

    }
}