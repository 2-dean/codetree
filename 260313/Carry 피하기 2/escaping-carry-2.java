import java.util.*;
import java.io.*;

public class Main {
    public static final int MAX_VAL = Integer.MIN_VALUE;

    public static boolean isValid (int a, int b, int c) {
        while (a > 0 || b > 0 || c > 0){
            int sum = (a % 10) + (b % 10) + (c % 10);
            if (sum >= 10) return false;

            a /= 10;
            b /= 10;
            c /= 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = MAX_VAL ;
        // 입력 수는 모두다름, 3가지 수를 더했을때 10의 자릿수를 넘지 않는것
        for (int i = 0 ; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (isValid(arr[i], arr[j], arr[k])) {
                        int sum = arr[i] + arr[j] + arr[k];
                        max = Math.max(max, sum);
                    }
                }
            }
        }
        System.out.print(max == 0 ? -1 : max);
    }
}