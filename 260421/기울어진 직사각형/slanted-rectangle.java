import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int maxSum = 0;
        // 1. 시작점 정하기 (아래쪽 꼭짓점)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                //가능한 모든 가로 세로 조합 탐색
                for (int w = 1; w < n; w++) {
                    for (int h = 1; h < n; h++) {
                        
                        int currentSum = 0;
                        int x = i;
                        int y = j;
                        boolean isPossible = true;

                        // 방향순서 : 오위 
                        int[] dx = {-1, -1, 1, 1};
                        int[] dy = {1, -1, -1, 1};
                        int[] moveSteps ={w, h, w, h};

                        for (int d = 0; d < 4; d++) {
                            for (int step = 0; step < moveSteps[d]; step++) {
                                x += dx[d];
                                y += dy[d];

                                // 격자 밖으로 나가면 탈락
                                if (x < 0 || x >= n || y < 0 || y >= n) {
                                    isPossible = false;
                                    break;
                                }
                                currentSum += grid[x][y];
                            }
                            if (!isPossible) break;
                        }
                        // 네모 그리는데 성공했으면 최댓값 갱신
                        if (isPossible) {
                            maxSum = Math.max(maxSum, currentSum);
                        }
                    }
                }
            }
        }
        System.out.print(maxSum);
    }
}