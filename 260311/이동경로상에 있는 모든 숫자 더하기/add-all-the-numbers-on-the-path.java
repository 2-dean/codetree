import java.util.Scanner;

public class Main {
                            // 동 남 서 북
    public static int[] dx = {0, 1, 0, -1}; //row 
    public static int[] dy = {1, 0, -1, 0}; //col
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n * n배열
        int t = sc.nextInt(); // 명령수
        String s = sc.next();

        int[][] board = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        // 초기 위치
        int x = n/2;
        int y = n/2;
        // 초기 방향 
        int dirNum = 3;

        int sum = board[x][y];
        // L, R -> 각 방향으로 방향전환 F -> 칸 이동
        for (int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                dirNum = (dirNum + 3) % 4;
            } else if (c == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else { // F => 칸이동
                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];
                if (nx >= 0 && nx < n && ny >=0 && ny < n) {
                    x = nx;
                    y = ny;
                    sum += board[x][y];
                }
            }
        }

        System.out.print(sum);

    }
}