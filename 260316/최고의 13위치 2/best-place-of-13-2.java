import java.util.Scanner;
public class Main {
    public static int n;

    public static boolean inRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        // Please write your code here.

        int maxCnt = 0;
        // 격자 1
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n - 2 ; j++) {
                 // 격자2
                for (int k = 0; k < n ; k++) {
                    for(int l = 0; l < n - 2; l++) {
                        // 두 격자가 겹치는 경우에는 세지않음
                        if (i == k && Math.abs(j - l) <= 2) // j-1 > 길이 
                            continue;
                        // 두 격자가 겹치지 않는 경우에 대해 동전 수를 세어 갱신
                        int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                        int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];
                        maxCnt = Math.max(maxCnt, cnt1 + cnt2);
                    }

                }
            }
     
        }
        System.out.print(maxCnt);
    }
}