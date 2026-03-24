import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.

        // x에 2를 곱하는 것 을 n번 반복
        int ans = 100000;

        for (int x = 1; x <= 10000; x++) {
            int currentX = x;
            boolean success = true;

            for (int i = 0; i < n; i++) {
                currentX *= 2; //2배한

                // currentX가 범위 밖?
                if (a[i] > currentX || currentX > b[i]){
                    success = false;
                    break;
                }
            }
            if (success) {
                ans = Math.min(ans, x);
            }
        }
        System.out.print(ans);
    }
}