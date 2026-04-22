import java.util.Scanner;
public class Main {
    static int n;
    static int m;

    static int[][] grid;

    // 우 하 좌 상
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static int findMaxSum (int x1, int y1, int x2, int y2) {
        int sumOfNums = 0;
        for(int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] < 0) return -1;
                sumOfNums++;
            }
        }
        return sumOfNums;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int maxSum = Integer.MIN_VALUE;
        // 왼쪽상단 i, j에서 시작 
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                for (int w = 1; w < n; w ++) {
                    for (int h = 1; h < m; h++){
                        maxSum = Math.max(maxSum, findMaxSum(i, j, w, h));
                    }
                }
            }
        }
        System.out.print(maxSum);
    }
}