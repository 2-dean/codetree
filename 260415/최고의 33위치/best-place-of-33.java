import java.util.Scanner;
public class Main {
    static int n;
    static int[][] grid;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        grid = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int maxCnt = 0;
        for (int i = 0; i <= n - 3; i++) { // 1번
            for(int j = 0; j <= n - 3; j++){ // 2번째
                // 1의 갯수세기
                int count = 0 ;
            
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (grid[k][l] == 1) count++;
                    }
                }
                maxCnt = Math.max(count, maxCnt);
                
            }
        }
        System.out.print(maxCnt);
    }
}