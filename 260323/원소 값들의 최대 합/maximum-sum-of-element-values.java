import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        //원소들의 합이 최대
        long maxSum = Integer.MIN_VALUE;
        // 시작위치 1번 부터 해보기)
        for (int i = 1; i <= n; i ++) { // 인덱스
            long sum = 0;
            int now = i;
            //m번 움직임    
            for (int j = 0; j < m; j++) {
                int value = arr[now]; // 시작위치에 적힌 숫자
                sum += value;
                now = value;// 그숫자가 다음위치
            }
            //System.out.println("------ ");
            maxSum = Math.max(sum, maxSum);
        }
        System.out.print(maxSum);

        // Please write your code here.
    }
}