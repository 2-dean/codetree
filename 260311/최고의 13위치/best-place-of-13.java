import java.util.Scanner;
public class Main {
    public static int MAX_VAL = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        
        // 1*3 크기의 격자 
        int maxVal = MAX_VAL;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n-2; j++) {
                sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2];
                maxVal = Math.max(maxVal, sum);
            }
          
        }

        System.out.print(maxVal);
    }
}