import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int totalDist = 0;
        // 1. 일단 모든 체크포인트를 다 방문했을 때의 전체 거리를 구합니다.
        for (int i = 1; i < n; i++) {
            totalDist += Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1]);
        }

        int maxSkip = 0;
        // 2. 중간 점(1 ~ n-2) 중 하나를 건너뛰었을 때 "줄어드는 거리"가 가장 큰 곳을 찾습니다.
        for (int i = 1; i < n - 1; i++) {
            // 원래 가던 길: (i-1 -> i) + (i -> i+1)
            int original = Math.abs(x[i] - x[i-1]) + Math.abs(y[i] - y[i-1])
                         + Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
            
            // 건너뛰는 길: (i-1 -> i+1)
            int skip = Math.abs(x[i+1] - x[i-1]) + Math.abs(y[i+1] - y[i-1]);
            
            // 얼마나 이득인가?
            maxSkip = Math.max(maxSkip, original - skip);
        }

        // 3. 전체 거리에서 최대 이득을 뺍니다.
        System.out.print(totalDist - maxSkip);
    }
}