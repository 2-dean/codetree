
import java.util.Scanner;
public class Main {

    public static final int MIN_VAL = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int minVal = MIN_VAL;

        // 시작 방 i를 1번부터 N번까지 순회 반시계방향 
        for (int i = 0 ; i < n; i++) {
            int currentSum = 0;
            for (int j = 0; j < n ; j++) {
            // 각 시작 방마다 다른 모든 방 j까지의 거리  * 인원수 합or문)
                //i 부터 j까지 거리
                int dist = (j - 1 + n) % n; 
                currentSum += dist * arr[j];
            }
            minVal = Math.min(minVal, currentSum);
        }
        // 그 합계들 중 가장 작은 놈을 고른다.

        System.out.print(minVal);
    }
}