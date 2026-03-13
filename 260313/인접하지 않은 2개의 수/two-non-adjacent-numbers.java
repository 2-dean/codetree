import java.util.Scanner;

public class Main {
    public static final int INT_MAX = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = INT_MAX;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        // 인접하지 않은 두개의 수의 합을 구함
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                max = Math.max(max, arr[i] + arr[j]);
            }
        }

        System.out.print(max);
     } 
}