import java.util.Scanner;
public class Main {
    static int n;
    static int m;

    static int[][] grid;

    // 우 하 좌 상
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    static boolean isPositiveRect (int x1, int y1, int x2, int y2) {
        for(int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] < 0) return false;
            }
        }
        return true;
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

        int maxArea = -1;
        // 왼쪽상단 i, j에서 시작 
        for(int i = 0 ; i < n ; i++) {
            for (int j = 0; j < m; j++) {

                for (int k = i; k < n; k++) { //끝행
                    for (int l = j; l < m; l++){ // 끝열
                        if(isPositiveRect(i, j, k, l)) {
                            int area = (k - i + 1) * (l - j + 1); // 면적
                            maxArea = Math.max(maxArea, area);
                        }
                    }
                }
            }
        }
        System.out.print(maxArea);
    }
}