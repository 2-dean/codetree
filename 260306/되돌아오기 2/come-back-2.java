import java.util.Scanner;
public class Main {
                        // 동 남 서 북
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        int y = 0;
        int time = 0;
        int dir = 3; //북
        // Please write your code here.
        for (int i = 0; i < s.length(); i++) {
            // 방향전환 및 이동
            if (s.charAt(i) == 'F') {
                x += dx[dir];
                y += dy[dir];
            } else if (s.charAt(i) == 'L') {
                dir = (dir - 1) % 4;
            } else  if (s.charAt(i) == 'R') {
                dir = (dir + 1) % 4;
            }
            time++;
            //0.0에 왔나?
            if (x == 0 && y == 0) {
                System.out.print(time);
                return;
            }
        }
        System.out.print(-1);

    }
}