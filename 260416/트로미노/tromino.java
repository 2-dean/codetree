import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int maxSum = 0;
        // 꺾인거 회전해서 탐색
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < m - 1 ; j++) {
                // 왼쪽위/오른쪽위/왼쪽아래/오른쪽아래 제외
                int s1 = grid[i][j+1] + grid[i+1][j] + grid[i+1][j+1];
                int s2 = grid[i][j] + grid[i+1][j] + grid[i+1][j+1];
                int s3 = grid[i][j] + grid[i][j+1] + grid[i+1][j+1];
                int s4 = grid[i][j] + grid[i][j+1] + grid[i+1][j];
                
                int currentMax = Math.max(s1, Math.max(s2, Math.max(s3, s4)));
                maxSum = Math.max(maxSum, currentMax);                
            }
        }


        // | ㅡ 회전해서 탐색

        // 가로
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m-2; j++) {
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                maxSum = Math.max(maxSum, sum);
            }
        }
        //세로
        for (int i = 0; i < n - 2; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = grid[i][j] + grid[i+1][j] + grid[i+2][j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.print(maxSum);
    }
}