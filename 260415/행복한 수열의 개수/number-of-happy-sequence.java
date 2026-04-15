import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        
        // m이 1이면 무조건 다 행복
        if (m == 1) {
            System.out.print(2 * n);
            return;
        }

        int totalHappy  = 0;

        // 가로체크
        for (int i = 0 ; i < n;  i++) {
            int maxConsecutive = 1; // 현재 행에서 가장 길게 연속된 횟수
            int currentCnt = 1; //지금 연속되는 횟수
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == grid[i][j - 1]) {
                    currentCnt++;
                } else {
                    currentCnt = 1; // 끊기면 초기화
                }
                maxConsecutive = Math.max(maxConsecutive, currentCnt);
            }
            if(maxConsecutive >= m) totalHappy++;
        }

        //세로체크
        int colHappyNum = 0;
        for (int j = 0 ; j < n;  j++) {
            int maxConsecutive = 1;
            int currentCnt = 1;
            for (int i = 1; i < n; i++) {
                 if (grid[i][j] == grid[i - 1][j]) {
                    currentCnt++;
                } else {
                    currentCnt = 1;
                }
                maxConsecutive = Math.max(maxConsecutive, currentCnt);
            }
            if(maxConsecutive >= m) totalHappy++;
        }
        System.out.print(totalHappy);
    }
}