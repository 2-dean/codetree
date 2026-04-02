import java.util.*;

public class Main {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int max = Integer.MIN_VALUE;
        Arrays.sort(arr);
        // 가장 작은 음수 2 * 가장큰 양수 1 
        int num1 = arr[0] * arr[1] * arr[n-1];
        // 큰 양수 3개 곱
        int num2 = arr[n-1] * arr[n-2] * arr[n-3];

        max = Math.max(num1, num2);
        System.out.print(max);

    }
}