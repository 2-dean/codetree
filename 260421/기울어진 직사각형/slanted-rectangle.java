import java.util.Scanner;
public class Main {
    static int n;
    static int[][] grid;

    public static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    static int getScore (int x, int y, int w, int h) {
        int[] dx = {-1, -1, 1, 1};
        int[] dy = {1, -1, -1, 1};
        int[] moveNum = new int[]{w, h, w, h};

        int sum = 0;
        for (int d = 0; d < 4; d++) {
            for (int q = 0; q < moveNum[d]; q++) {
                x += dx[d]; 
                y += dy[d];

                // 
                if (!inRange(x, y))
                    return 0;
                sum += grid[x][y];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        int answer = 0;
        //(i,j)에서 시작 해서 1,2,3,4 방향 탐색
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n;  j++) {
                //순서대로 길이 w, h, w, h 만큼 이동하면서 그려지는 기울어진 직사각형을 잡아봄
            
                for (int w = 1; w < n; w++) {
                    for (int h = 1; h < n; h++) {
                        answer = Math.max(answer, getScore(i, j, w, h));
                    }
                }
            }
        }

        System.out.print(answer);
    }
}