import java.util.Scanner;
public class Main {
    static int n;
    static int m;
    // 반시계  D/ R / U / L
    static int[] dx = {1, 0, -1, 0}; //row
    static int[] dy = {0, 1, 0, -1}; //col
    static int[][] arr;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // row
        m = sc.nextInt(); // col
        // Please write your code here.
        arr = new int[n][m];

        arr[0][0] = 1;
        int dirNum = 0;
        int x = 0;
        int y = 0;
        
        for (int i = 2; i <= n * m; i ++) {
            // 새 좌표
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            // 범위 벗어나면 방향전환
            if (!inRange(nx, ny) || arr[nx][ny] != 0) {
                dirNum = (dirNum + 1) % 4;
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            // 3. 확정된 위치로 이동 후 값 기록
            x = nx;
            y = ny;
            arr[x][y] = i;            
        }

        for (int i = 0; i < n ; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}