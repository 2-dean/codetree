import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int totSum = 0;

        for (int a : arr) {
            totSum += a;    
        }

        int minDiff = Integer.MAX_VALUE; //최소 차 저장

        // 뺄 숫자 두개 고르기
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                // 두개를 뺀 나머지의 합
                int currentSum = totSum - arr[i] - arr[j];

                int diff = Math.abs(currentSum - s); // s와의 차이

                minDiff = Math.min(minDiff, diff);
            }
        }

        System.out.print(minDiff);
    }   
}