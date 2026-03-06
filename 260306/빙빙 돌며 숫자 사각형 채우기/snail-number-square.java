import java.util.Scanner;
public class Main {
    static int n;
    static int m;
                    // R/D/L/U
    static int[] dx = {0, 1, 0, -1}; 
    static int[] dy = {1, 0, -1, 0};

    public static boolean inRange (int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 행
        m = sc.nextInt(); // 열
        // Please write your code here.

        int[][] answer = new int[n][m];
        int x = 0;
        int y = 0;
        int dirNum = 0;

        //초기값
        answer[x][y] = 1;

       // 배열 전체 순환
        for (int i = 2; i <= n * m; i++) {
            // 현재방향 기준
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            // 범위 밖 |\ 이미 들름
            if(!inRange(nx, ny) || answer[nx][ny] != 0) {
                // 방향전환 (시계)
                dirNum = (dirNum + 1) % 4;
            } 
            // 위치이동 후 값을 채워넣기
            x = x + dx[dirNum]; 
            y = y + dy[dirNum];
            answer[x][y] = i;
            
        }

        for (int i = 0;  i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j] + " " );
            }
            System.out.println();

        }


    }
}