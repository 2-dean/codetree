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
               
        // 전체 금 채굴비용
        int maxGold = 0;
        // k의 범위 잡기
        for(int k = 0; k <= n + 1; k++) {
            int cost = k * k + (k + 1) * (k + 1);  // 채굴비용

            //모든 좌표를 중심으로 잡기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    int currentGold = 0;
                    // 전체를 돌면서 중심과의 거리가 k 이하인 금을 찾음
                    for (int r = 0; r < n; r++) {
                        for (int c = 0; c < n; c++) {
                            if (Math.abs(i - r) + Math.abs(j - c) <= k) {
                                if (grid[r][c] == 1) currentGold++;
                            }
                        }
                    }
                    // 4. 손해를 안 보는지 확인 (수익 >= 비용) ㅋ 🦾
                    if (currentGold * m >= cost) {
                        maxGold = Math.max(maxGold, currentGold);
                    }
                }

            }
        }

        System.out.print(maxGold);  
    }
}