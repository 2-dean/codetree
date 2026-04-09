import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        while (!dq.isEmpty()) {
            // 맨앞 정수 제거
            dq.pollFirst();
            // 남은 수열의 맨 앞 정수를 맨뒤로 이동
            dq.addLast(dq.pollFirst());
            if (dq.size() == 1) {
                System.out.print(dq.pollFirst());
            }
        }
    }
}