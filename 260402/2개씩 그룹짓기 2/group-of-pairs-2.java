import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0 ; i < n ; i++) {
            int diff = arr[i + n] - arr[i];// 맨뒤 - 맨앞(젤큰수-젤작은수)
            minDiff = Math.min(minDiff, diff);
        }
        System.out.print(minDiff);
    }
}