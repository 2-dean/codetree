import java.util.Scanner;

public class Main {
                // 방향 :  우 /상/ 좌/ 하
    static int[] dx = {0, -1, 0, 1}; // row
    static int[] dy = {1, 0, -1, 0}; // col

    static int n;
    static int[][] arr;

    public static boolean isRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Please write your code here.
        arr = new int[n][n];

        // 시작점 :  n / 2, n /2
        int x = n / 2;
        int y = n / 2;
        
        // 값셋팅
        arr[x][y] = 1;
        
        int dirNum = 0;
        int count = 2;
        int len = 1; // 이동길이

        while (count <= n * n) {
            // 같은 길이 2번씩
            for(int j = 0; j < 2; j++) {
                for (int k = 0; k < len; k++) {
                    int nx = x + dx[dirNum];
                    int ny = y + dy[dirNum];

                    if (isRange(nx, ny) && arr[nx][ny] == 0) {
                        x = nx;
                        y = ny;
                        arr[x][y] = count;
                        count++;            
                    } 
                }
                dirNum = (dirNum + 1) % 4;
            }        
            len++; //길이증가
        }
        

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}